const express = require('express');

const app = express();

const courses = [
    {id: 1, courses: 'course1'},
    {id: 2, courses: 'course2'},
    {id: 3, courses: 'course3'}
];

app.get('/', (req, res) => {
    res.send('Hello World !!!');
})

app.get('/api/courses', (req, res) => {
    res.send(courses);
})


// for query params (meaning ?name=atul), u dont need to add a new api.
// it will get appended in the same api only.
// eg:- /api/courses/1 &&
// /api/courses/1?sortBy=name come to this get request only.

// app.get('/api/courses/:id', (req, res) => {
//     res.send({
//         id: req.params.id,
//         queryParams: req.query
//     });
// })

app.get('/api/courses/:id', (req, res) => {
    const reqCourse = courses.find(c => c.id === parseInt(req.params.id));
    res.send(reqCourse ? reqCourse :
         res.status(404).send('The course with the given Id was not found'));
})


const port = process.env.PORT || 3000   

app.listen(port, () => {
    console.log('Listening on port', port);
})