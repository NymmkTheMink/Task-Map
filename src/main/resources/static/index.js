document.getElementById('status').addEventListener('click', function() {
    var statusText = document.getElementById('status-text');
    statusText.textContent = statusText.textContent === 'Ongoing' ? 'Completed' : 'Ongoing';
});

function toHome() {
    window.location.href = '/';
}

function helpPanel(){

}