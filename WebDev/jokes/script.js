const jokeResult = document.getElementById('joke-results');

const fetchJoke = async () => {
    try {
        const response = await fetch("https://v2.jokeapi.dev/joke/Programming?blacklistFlags=nsfw,religious,political,racist,sexist,explicit");
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const joke = await response.json();
        if (joke.type === 'single') {
            jokeResult.innerHTML = `<p>${joke.joke}</p>`;
        } else if (joke.type === 'twopart') {
            jokeResult.innerHTML = `<p>${joke.setup}</p><p>${joke.delivery}</p>`;
        } else {
            jokeResult.innerHTML = `<p>Unexpected joke format received.</p>`;
        }
    }
    catch (error) {
        console.error('Error fetching joke:', error);
    }
}