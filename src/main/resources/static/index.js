document.getElementById('status').addEventListener('click', function() {
    var statusText = document.getElementById('status-text');
    statusText.textContent = statusText.textContent === 'Ongoing' ? 'Completed' : 'Ongoing';
});

function toHome() {
    window.location.href = '/';
}

function helpPanel(){

}

function downloadManuel(){

}

function createProjectPanel() {
    fetch('create-project-panel.html')
        .then(response => response.text())
        .then(data => document.querySelector('#project-creator-panel').innerHTML = data);
}

function submitProject(event) {
    event.preventDefault();

    const projectName = document.getElementById('projectName').value;

    fetch('/api/projects', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: projectName }),
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            alert('Form successfully submitted!'); // Add this line
        })
        .catch((error) => {
            console.error('Error:', error);
        });
}