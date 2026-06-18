let hour = document.getElementById('hr');
let minute = document.getElementById('min');
let second = document.getElementById('sec');

let count = 0;

setInterval(() => {
    count++;
    if(count == 60){
        count = 0;
        minute.innerText = parseInt(minute.innerText) + 1;
    }

    if(parseInt(minute.innerText) == 60){
        minute.innerText = 0;
        hour.innerText = parseInt(hour.innerText) + 1;
    }

    second.innerText = count;
}, 1000);


let inputBox = document.getElementById('input');

inputBox.addEventListener('input', (e) => {
    console.log(e.target.value);
});


let para = document.getElementById('para');

let btn = document.getElementById('btn');

btn.addEventListener('click', () => {
    para.innerText = inputBox.value;
});