const fs = require('fs');

fs.readFile('/Users/mmt7411/Downloads/fine.txt','utf8', (err, data) => {
    const a = data.split('\n\n')
    const array = []
    // const finalarray = a.map(item1 => {
    //     const d = item1.split('\n');
    //     d.reduce((acc, item) => {
    //         const list = item.split(':');
    //         return {
    //             [list[0].trim()]: list[1].trim(),
    //             ...acc
    //         }
    //     }, {});
    // });
    // console.log(a[a.length-2]);
    for(let i=0;i<a.length -1;i++) {
        const d = a[i].split('\n');
        const object = d.reduce((acc, item) => {
        const list = item.split(':');
        return {
            [list[0].trim()]: list[1].trim(),
            ...acc
        }
    }, {});
        array.push(object);
    }
    console.log(array);
    // const d = a[0].split('\n');
    // const object = d.reduce((acc, item) => {
    //     const list = item.split(':');
    //     return {
    //         [list[0].trim()]: list[1].trim(),
    //         ...acc
    //     }
    // }, {});
    // console.log(object);
    // const data = a[0].split(':');
    // console.log('data 9', data[9]);
    // const object = {
    //     [data[0].trim()]: data[1].toString().trim(),
    //     [data[2].trim()]: data[3].toString().trim(),
    //     [data[4].trim()]: data[5].toString().trim(),
    //     [data[8].trim()]: data[9].toString().trim(),
    //     [data[10].trim()]: data[11].toString().trim(),
    //     [data[12].trim()]: data[13].toString().trim(),
    //     [data[14].trim()]: data[15].toString().trim(),
    // }
    //     array.push(object);
    // console.log(array[0]);
    // console.log(array[1]);
})