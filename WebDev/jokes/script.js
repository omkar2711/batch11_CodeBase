const jokeResult = document.getElementById('joke-results');

const fetchJoke = async () => {
    try {
        const response = await fetch("https://v2.jokeapi.dev/joke/Programming?blacklistFlags=nsfw,religious,political,racist,sexist,explicit");
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const data = await response.json();
        if (data.type === 'single') {
            jokeResult.innerHTML = `<p>${data.joke}</p>`;
        } else if (data.type === 'twopart') {
            jokeResult.innerHTML = `<p>${data.setup}</p><p>${data.delivery}</p>`;
        } else {
            jokeResult.innerHTML = `<p>Unexpected joke format received.</p>`;
        }
    }
    catch (error) {
        console.error('Error fetching joke:', error);
    }
}


let count = 100;
console.log("the count is: " + count + " and the type of count is: " + typeof count);
//TEMPLATE LITERAL
console.log(`the count is: ${count} and the type of count is: ${typeof count}`);