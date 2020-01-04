// path module

// const path = require('path');

// console.log(path.parse(__filename));


//os Module

// const os = require('os');

// console.log(`Total Memory: ${os.totalmem()}`);

// console.log(`Free Memory: ${os.freemem()}`);

// file system module

// const fs = require('fs');

// const files = fs.readdirSync('./');
// console.log(files);

// fs.readdir('./', function(err, files) {
//   if (err) console.log('Error', err);
//   else console.log('Result', files);
// });


// Event Module

// const EventEmitter = require('events');

// const emitter = new EventEmitter();

//Register a listener
// emitter.on('messageLogged', (arg) => {
//   console.log('Listener called', arg);
// });

// Raise an event
// meaning signalling that a event has happend
// emitter.emit('messageLogged');
//
// emitter.emit('messageLogged', {id: 1, url: 'http://'})

const Logger = require('./logger');

const logger = new Logger();

logger.on('messageLogged', (arg) => {
  console.log('Listener called', arg);
});

logger.log('message');

