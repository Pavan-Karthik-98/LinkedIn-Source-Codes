
// Static variables
class Employee {
    static String company = "TechCorp"; // Shared by all employees 🏢
    String name;
}

// Static Methods
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

// Static block
class Database {
    static {
        System.out.println("Loading DB config... 🛠️");
    }
}

// Static Nested Class
class Outer {
    static class Nested {
        void show() {
            System.out.println("Nested class! 🪆");
        }
    }
}

public class Static {
    public static void main(String[] args) {
        // Static variables usage
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1.company); // "TechCorp"
        System.out.println(Employee.company); // ✅ Preferred way!

        // Static Methods Usage:
        int sum = MathUtils.add(5, 3); // No object needed! 🎯

        // Static Nested class Usage:
        Outer.Nested nested = new Outer.Nested(); // No Outer instance needed! 🎉
    }
}
