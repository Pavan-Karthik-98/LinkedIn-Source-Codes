import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        OOPSCalculator c = new OOPSCalculator();

        System.out.println("Enter the first value");
        // Reading the first value
        int a = in.nextInt();
        System.out.println("Enter the second value");
        // Reading the second value
        int b = in.nextInt();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtraction(a, b));
        System.out.println("Multiplication: " + c.multiplication(a, b));
        System.out.println("Division: " + c.division(a, b));

        in.close(); // Closing the scanner connection
    }
}
