//function declaration
function add(a,b){
    return a+b;
}


//function expression
let sub = function(a,b){
    return a-b;
};

let multiply = (a,b) => a*b;


let count = 100;

console.log("the count is: " + count + " and the type of count is: " + typeof count);

//template literal
console.log(`the count is: ${count} and the type of count is: ${typeof count}`);

//array destructuring
let arr = [10,20,30,40,50];

let [first, second, third, fourth, fifth] = arr;

console.log(first, second, third, fourth, fifth);

console.log(second, fourth);


//object destructuring
let person = {
    name: "Pranshu",
    email: "pranshu@example.com",
    password: "123456",
    age: 22,
    city: "Pune"
};

let {email, password} = person;

console.log(email, password);

//Rest Operator

function sum(...numbers){
    return numbers.reduce((acc, num) => acc + num, 0);
}

console.log(sum(1,2,3,4,5,6));


//spread operator
let arr1 = [1,2,3];
let arr2 = [4,5,6];

let combinedArr = [...arr1, ...arr2];
console.log(combinedArr);


//prototype intheritance
const car = {
    brand: "Toyota",
    name : "Camry",
    start: function(){
        console.log(`${this.brand} ${this.name} is starting...`);
    }
}

const electricCar = {
    battery: "100 kWh",
    __proto_: car
}

console.log(electricCar);





