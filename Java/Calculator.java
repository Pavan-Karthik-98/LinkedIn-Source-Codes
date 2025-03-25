import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Used to take input from the user
        while (true) {
            System.out.println("---------------Menu--------------");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.println("Enter your choice:");

            // Taking the input from the user
            int choice = in.nextInt();

            if (choice > 5 || choice < 1) {
                System.out.println("Wrong Option");
                // Skipping the current iteration to restart the loop
            }

            // Terminating the program
            if (choice == 5) {
                break;
            }
            System.out.println("Enter the first value");
            // Reading the first value
            int a = in.nextInt();
            System.out.println("Enter the second value");
            // Reading the second value
            int b = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The result is: " + (a + b));
                    break;
                case 2:
                    System.out.println("The result is: " + (a - b));
                    break;
                case 3:
                    System.out.println("The result is: " + (a * b));
                    break;
                case 4:
                    System.out.println("The result is: " + (a / b));
                default:
                    break;
            }
        }
        in.close(); // Closing the scanner connection
    }
}
