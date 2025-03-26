/* 
    🔹 3. The Magic of this
    Access other object properties inside methods using this: 
*/

let person = {
  firstName: "Bob",
  lastName: "Deol",
  getFullName() {
    return this.firstName + " " + this.lastName;
  },
};

console.log(person.getFullName()); // Output: Bob Deol
