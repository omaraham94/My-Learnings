function funct (fun, timeout) {
	const b = fun();
	const a = new Promise((resolve, reject) => {
		setTimeout(() => {reject(new Error("timed out"));}, timeout);

		});
	return Promise.race([a, b]);
}

function fun () {
	return new Promise((resolve, reject) => {
		setTimeout(() => {resolve()}, 100);
	});
}
funct(fun, 101).then(() => {
		console.log('success');
	})
	.catch(e => {
		console.log(e.message);
	})

