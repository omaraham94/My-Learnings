const EventEmitter = require('events');
var url = 'http://mylogger.io/log';

// console.log(__filename);
// console.log(__dirname);

class Logger extends EventEmitter {
  log(message) {
    // Send an http request
    console.log(message);
    this.emit('messageLogged', {id: 1, url: 'http://'})
  }
}

module.exports = Logger;
