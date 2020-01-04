const fun = () => {
	console.log('in fun before');
	return new Promise((resolve, reject) => {
		setTimeout(() => {
			console.log('in fun');
		}, 1000);
	})
	console.log('in fun after ');
};

const bun = () => {
	console.log('in bun before fun');
	fun();
	console.log('in bun after fun');
}

bun();
