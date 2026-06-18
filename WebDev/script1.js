function fetchData(handleData) {
    setTimeout(() => {
        const data = { name: "John Doe" };
        handleData(data);
    }, 2000);
}

function handleData(data) {
    console.log(data.name); // "John Doe"
}

fetchData(handleData);
