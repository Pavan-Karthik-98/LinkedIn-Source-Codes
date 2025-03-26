/* 
🔹 1. Adding Methods to Objects
Turn a property into a method by assigning a function: 
*/

let person = {
  firstName: "Bob",
  lastName: "Deol",
};

person.greet = function () {
  console.log("Hello!");
};

person.greet(); // Output: Hello!
