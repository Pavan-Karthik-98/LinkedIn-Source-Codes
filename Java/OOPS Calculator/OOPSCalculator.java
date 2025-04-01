public class OOPSCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not a Number" to indicate an error
        }
        return (double) a / b; // Casting to double for precise division
    }
}
