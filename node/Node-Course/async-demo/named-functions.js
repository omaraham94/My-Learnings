// callback hell

console.log('before');
getUser(1, getRepositories);

// named functions can help in resolving callback hell

function displayCommits(commits) {
    console.log(commits)
}

function getCommits(repos) {
    getCommits(repos, displayCommits)
}

function getRepositories(user) {
    console.log('User:', user);
    getCommits(user, getRepositories)
}

console.log('After');

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