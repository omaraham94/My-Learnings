const express = require('express');
const fs = require('fs');
const app = express();

app.use(express.json());

app.get('/', (req, res) => {
    res.send('Hell world');
})

app.listen(9000, () => {console.log('Listeinig on port 9000')});

