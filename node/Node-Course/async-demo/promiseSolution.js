// callback hell

// Promises 

console.log('before');
getUser(1)
.then((user) => {
    console.log('User:', user);
    return (getRepositories(user));
})
.then((repos) => {
    console.log('Repos', repos);
    return(getCommits(repos[0]));
})
.then((commits) => {
    console.log(commits);
 })
console.log('After');

function getCommits(repo, callback) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('get the commits');
            resolve(['commit1', 'commit2', 'commit3']);
        }, 2000);
    });
}

function getUser(id) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log('reading from database...');
            resolve({
                id: id, gitHubUsername: 'mosh'
            })
        }, 2000);
    });
};

function getRepositories(user) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(['repo1', 'repo2', 'repo3']);
        }, 2000);
    })
};


// javascript has only 3 ways to make a code synchronous :-
// 1. callback,
// 2. promises,
// 3. async/await