// Promise.resolve() // gives a resolved promise object

// Promise.reject() // gives a rejected promise object

// Promise.all([p1, p2]) // takes an array of promises and returns a promise
//object only after all of them are resolved.
// if any one of the promise is rejected, the promise.all promise is
// also rejected.

// p1 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve([1,2,3,4]);
//     }, 2000)
// })

// p2 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve([1,2,3,4,5,6,7]);
//     }, 2000)
// });

// Promise.all([p1, p2])
// .then(result => console.log(result))
// .catch(error => console.log(error.message));


// if any one of the promise fails, it goes to reject;

// p3 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve([1,2,3,4]);
//     }, 3000)
// })

// p4 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         reject(new Error('something went wrong'));
//     }, 2000)
// });

// Promise.race([p3, p4])
// .then(result => console.log(result))
// .catch(error => console.log(error.message));

// const myfun = (ms, fun) => {
//     const p2 = fun();
//     const p1 = new Promise((resolve, reject) => {
//         setTimeout(() => {reject(new Error('timedout'))}, ms)
//     });
//     return Promise.race([p1, p2]);
// }

// myfun(500, () => p2(501))
// .then(result => {console.log(result)})
// .catch(error => {console.log(error)});

// function p1(ms) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             reject(new Error('timedout'));
//         }, ms);
//     });
// }

// function p2 (ms) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve('I got resolved');
//         }, ms)
//     });
// }

// Promise.race([p1(100), p2(200)])
// .then(result => console.log(result))
// .catch(error => console.log(error.message));

const a = new Promise((resolve) => {
    setTimeout(() => {
        resolve(1);
    }, 2000)
})
.then(data => { console.log(data); });