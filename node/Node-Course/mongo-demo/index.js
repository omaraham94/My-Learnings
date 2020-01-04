const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost/playground')
.then(() => {console.log('Connected to MongoDB')})
.catch(error => console.error('Couldnot conect to mongodb', error));

const courseSchema = new mongoose.Schema({
    name: String,
    author: String,
    tags: [String],
    date: {type: Date, default: Date.now},
    isPublished: Boolean
})

/*
    Types in a schema :- 
    String
    Number
    Date
    Buffer :- used for storing binary data
    Boolean
    ObjectID :- assigning unique identifiers
    Array
    */

const Course = mongoose.model('Course', courseSchema);

async function createCourse() {
    const course = new Course({
        name: 'Angular course',
        author: 'mosh',
        tags: ['angular', 'frontend'],
        isPublished: true
    });    
    const result = await course.save();
}

// name : 1 => ascending with name and name: -1 will return decending
async function getCourses() {
    /*
    Comparision query operators :-
        eq,
        ne,
        gt,
        gte,
        lt,
        lte,
        in,
        nin
        Usage: -
        find({price: {$ge: 10}}) // price >= 10
        find({price: {$in: [10,15,20]}}) // price = 10 or 15 or 20
    */

    /*
        Logical operators
        or
        and
    */
    const courses = await Course
    .find({author: 'mosh', isPublished: true})
    .limit(10)
    .sort({name: 1})
    .select({name: 1, tags: 1})
    
    console.log(courses);
}

getCourses();