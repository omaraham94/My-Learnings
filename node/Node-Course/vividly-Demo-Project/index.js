const appStartup = require('debug')('app:startup');
const fetch = require('node-fetch');
const config = require('config');
const express = require('express');
const Joi = require('joi');
const mysql = require('mysql');
const uuid = require('uuid/v1');

const app = express();

app.use(express.json());

var con = mysql.createConnection({
  host: "172.16.43.123",
  user: "metro",
  password: "M3tr0@123",
  database: "metro"
});


app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });

//configuration

// console.log('Application name' + config.get('name'));
// console.log('Application name' + config.get('mail.host'));
// console.log('Application name' + config.get('mail.password'));

appStartup('Application Started');

const genres = [
    {id: 1, name: 'genres1'},
    {id: 2, name: 'genres2'},
    {id: 3, name: 'genres3'},
    {id: 4, name: 'genres4'}
];

app.get('/', async (req, res) => {
    console.log('atul ---->', req.query.url, {
        headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const data = await fetch(req.query.url);
    const d = await data.json();
    console.log(d);
    res.send(d);
});

app.get('/autocomplete', async (req, res) => {
    const url = req.query.url+'&limit=10';
    console.log(url);
    const data = await fetch(url);
    const d = await data.json();
    res.send(d);
});

app.get('/mapi', async (req, res) => {
    const url = 'http://mapi.makemytrip.com/cosmos_personalization/v2/getalloffers';
    const data = await fetch(url, {
      headers: {
        'Authorization': 'DwEjF4vuXy01',
        'Accept': 'application/json',
        'os': 'pwa',
      }
    });
    const d = await data.json();
    res.send(d);
});

app.post('/', async (req, res) => {
    console.log('url ->', req.query.url);
    console.log('headers ->', req.headers);
    console.log('body ->', req.body);
    const data = await fetch(req.query.url,{
        method: 'POST',
        headers: {
            Accept: 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(req.body)
    }
    );
    const d = await data.json();
    res.send(d);
});

app.get('/api/genres', (req, res) => {
    res.send(genres);
});

app.get('/api/genres/:id', (req, res) => {
    const genre = genres.find(g => g.id === parseInt(req.params.id));
    if (!genre) {
        return res.status(404).send('Requested genre not found');
    }
    return res.send(genre);
});

app.get('/api/updateFareList', async (req, res) => {
    const stationList = await fetch('http://172.16.47.197/metro/hyderabad/enquiry/station/getAll/v1', {
        method: 'POST',
      headers: {
            'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        "trackingParams": {
          "channelCode": "android",
          "affiliateCode": "MMT"
        }
      })
    });
    const response = await stationList.json();

    console.log('atl ===>', response);

    const promiseArray = [];
    const stationDetailsList = response.stationList;
    for(let i=0 ;i < stationDetailsList.length; i++) {
      const fareList = fetch('http://172.16.47.197/metro/hyderabad/enquiry/station/getFareList/v1', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          "trackingParams": {
            "channelCode": "android",
            "affiliateCode": "MMT",
            "correlationId": "123456ABCDEFGHI"
          },
          "fromStnCode": stationDetailsList[i].stationCode,
          "fromStnName": stationDetailsList[i].stationName,
          "ticketType": "SJT"
        })
      });
      promiseArray.push(fareList);
    }
    const ans = await Promise.all(promiseArray);
    // console.log('atul --------------->', await ans[0].json());
    const res1 = await Promise.all(ans.map(item => item.json()));
    const res2 = [];

    res1.forEach((item) => {
      item.fareList.forEach(val => {
        res2.push([uuid() , 0, new Date(), item.fromStnName, item.fromStnCode, val.toStationName, val.toStnCode, val.unitPrice, new Date()]);
      })
    });

    con.connect(function(err) {
      if (err) throw err;
      console.log("Connected!");
      var sql = "INSERT INTO metro.fare_details (id, version, created, from_station_name, from_station_code, to_station_name, to_station_code, price, updated) VALUES ?";
      con.query(sql, [res2], function (err, result) {
        if (err) throw err;
        console.log("Number of records inserted: " + result.affectedRows);
      })
    });

    return res.send(res2);
});

app.post('/api/genres', (req, res) => {
    const schema = {
        name: Joi.string().min(3).required()
    };

    const result = Joi.validate(req.body, schema);
    if (result.error) {
        return res.status(400).send(result.error.details[0].message);
    }
    const genre = {
        id: genres.length + 1,
        name: req.body.name
    };

    genres.push(genre);
    res.send(genre);
});

app.put('/api/genres/:id', (req, res) => {
    const genre = genres.find(g => g.id === parseInt(req.params.id));
    if (!genre) {
        return res.status(404).send('Requested genre not found');
    }
    const schema = {
        name: Joi.string().min(3).required()
    };

    const result = Joi.validate(req.body, schema);
    if (result.error) {
        return res.status(400).send(result.error.details[0].message);
    }
    genre.name = req.body.name;
    return res.send(genre);
});

app.delete('/api/genres/:id', (req, res) => {
    const genre = genres.find(g => g.id === parseInt(req.params.id));
    if (!genre) {
        return res.status(404).send('Requested genre not found');
    }
    const index = genres.indexOf(genre);
    genres.splice(index, 1);
    return res.send(genre);
});

const PORT = 3001;
app.listen(PORT, () => console.log('Listening on port ', PORT));
