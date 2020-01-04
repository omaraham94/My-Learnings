const fetch = require('node-fetch');
const fun1 = async ()  => {
	const res = await fetch('http://registry.npmjs.org/forever/latest', {
	method: 'POST',
	headers: {
}
});
	const response = await res.json();
	console.log('response', response.dependencies);
	console.log(Object.keys(response.dependencies));
}

fun1();
