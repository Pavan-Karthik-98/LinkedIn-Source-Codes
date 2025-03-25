// 1️⃣ First-Class Citizens
// Assigning to variable
const greet = function (name) {
  return `Hello, ${name}!`;
};
console.log(greet("Alice")); // "Hello, Alice!"

// Passing as argument
function processUser(name, callback) {
  return callback(name.toUpperCase());
}
console.log(processUser("Bob", greet)); // "Hello, BOB!"

// Returning functions
function createMultiplier(factor) {
  return (num) => num * factor;
}
const double = createMultiplier(2);
console.log(double(5)); // 10

//2️⃣ Pass-by-Value

function modifyValue(x) {
  x = 42;
  console.log(x); // 42 (inside function)
}

let original = 10;
modifyValue(original);
console.log(original); // 10 (unchanged)

// 3️⃣ Recursive Functions
function factorial(n) {
  if (n <= 1) return 1;
  return n * factorial(n - 1);
}
console.log(factorial(5)); // 120

// 4️⃣ Default Parameters
function order(item = "coffee", quantity = 1) {
  return `Ordered ${quantity} ${item}(s)`;
}
console.log(order()); // "Ordered 1 coffee(s)"
console.log(order("tea", 3)); // "Ordered 3 tea(s)"
