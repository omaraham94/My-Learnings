originalLog = console.log;

console.log = function(...args) {
originalLog.apply(console, ["Hello World:- ", ...args]);
}
console.log('my list');
