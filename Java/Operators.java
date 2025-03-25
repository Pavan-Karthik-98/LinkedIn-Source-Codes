public class Operators {
    public static void main(String[] args) {
        /*
         * 1. Arithmetic Operators
         * Used for basic mathematical operations.
         */
        int a = 10, b = 3;
        System.out.println("Sum: " + (a + b)); // Sum: 13
        System.out.println("Difference: " + (a - b)); // Difference: 7
        System.out.println("Product: " + (a * b)); // Product: 30
        System.out.println("Quotient: " + (a / b)); // Quotient: 3
        System.out.println("Remainder: " + (a % b)); // Remainder: 1

        /*
         * 2. Relational Operators
         * Used to Compare two values
         */
        System.out.println("a > b: " + (a > b)); // a > b: true
        System.out.println("a < b: " + (a < b)); // a < b: false
        System.out.println("a == b: " + (a == b)); // a == b: false
        System.out.println("a != b: " + (a != b)); // a != b: true
        System.out.println("a >= b: " + (a >= b)); // a >= b: true
        System.out.println("a <= b: " + (a <= b)); // a <= b: false

        /*
         * 3. Logical Operators
         * Used to combine multiple conditions
         */
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // x && y: false (AND)
        System.out.println("x || y: " + (x || y)); // x || y: true (OR)
        System.out.println("!x: " + (!x)); // !x: false (NOT)

        /*
         * 4. Assignment Operators
         * Used to assign values to variables
         */
        int c = 5;
        c += 3; // c = c + 3 → 8
        System.out.println("c += 3: " + c); // c += 3: 8
        c -= 2; // c = c - 2 → 6
        System.out.println("c -= 2: " + c); // c -= 2: 6
        c *= 2; // c = c * 2 → 12
        System.out.println("c *= 2: " + c); // c *= 2: 12
        c /= 3; // c = c / 3 → 4
        System.out.println("c /= 3: " + c); // c /= 3: 4
        c %= 3; // c = c % 3 → 1
        System.out.println("c %= 3: " + c); // c %= 3: 1

        /*
         * 5. Unary operators
         * Used for incrementing, decrementing, or negating values
         */
        int d = 5;
        System.out.println("d++: " + (d++)); // d++: 5 (post-increment)
        System.out.println("++d: " + (++d)); // ++d: 7 (pre-increment)
        System.out.println("d--: " + (d--)); // d--: 7 (post-decrement)
        System.out.println("--d: " + (--d)); // --d: 5 (pre-decrement)
        System.out.println("-d: " + (-d)); // -d: -5 (negation)

        /*
         * 6. Bitwise operators
         * Used to performo operations on binary representations of numbers
         */
        int e = 5, f = 3; // 5 = 0101, 3 = 0011
        System.out.println("e & f: " + (e & f)); // e & f: 1 (AND)
        System.out.println("e | f: " + (e | f)); // e | f: 7 (OR)
        System.out.println("e ^ f: " + (e ^ f)); // e ^ f: 6 (XOR)
        System.out.println("~e: " + (~e)); // ~e: -6 (NOT)
        System.out.println("e << 1: " + (e << 1)); // e << 1: 10 (Left Shift)
        System.out.println("e >> 1: " + (e >> 1)); // e >> 1: 2 (Right Shift)

        /*
         * 7. Ternary operator
         * A short hand for if else
         */
        int g = 10, h = 20;
        int result = (g > h) ? g : h; // 20
        System.out.println("Result: " + result); // Result: 20

        /*
         * 8. Instanceof Operator
         * Used to check if an object is an instance of specific class.
         */
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String)); // str instanceof String: true
    }

}
