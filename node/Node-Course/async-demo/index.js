// callback hell

console.log('before');
getUser(1, (user) => {
    console.log('User:', user);
    getRepositories(user, (repos) => {
        getCommits(repo, (commits) =>{
            // Callback hell
        })
    })
});

// named functions can help in resolving callback hell

console.log('After');

function getCommits(repo, callback) {
    setTimeout(() => {
        console.log('get the commits');
        callback(['commit1', 'commit2', 'commit3']);
    }, 2000);
}

function getUser(id, callback) {
    setTimeout(() => {
        console.log('reading from database...');
        callback({
            id: id, gitHubUsername: 'mosh'
        })
    }, 2000);
};

function getRepositories(user, callback) {
    setTimeout(() => {
        callback(['repo1', 'repo2', 'repo3']);
    }, 2000);
};


// javascript has only 3 ways to make a code synchronous :-
// 1. callback,
// 2. promises,
// 3. async/await