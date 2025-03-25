
public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3)); // Output: 8 (int version)
        System.out.println(add(2.5, 3.7)); // Output: 6.2 (double version)
    }
}
