public class ControlStatements {
    public static void main(String[] args) {
        // if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote!"); // Output: You are eligible to vote!
        }

        // if-else statement
        int marks = 45;
        if (marks >= 40) {
            System.out.println("Passed!"); // Output: Passed!
        } else {
            System.out.println("Failed!");
        }

        // if-else-if ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B"); // Output: Grade: B
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // switch

        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the workweek!"); // Output: Start of the workweek!
                break;
            case "Friday":
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("It's a regular day.");
        }

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i); // Output: Iteration: 1, 2, 3, 4, 5
        }

        // while loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count); // Output: Count: 1, 2, 3, 4, 5
            count++;
        }

        // do-while loop
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        // Output: Number: 1, 2, 3, 4, 5

        // break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }
        // Output: i: 1, 2, 3, 4

        // continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip iteration when i is 3
            }
            System.out.println("i: " + i);
        }
        // Output: i: 1, 2, 4, 5
        System.out.println("Sum: " + add(5, 3)); // Output: Sum: 8
    }

    // return
    public static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }

}
