
public class MethodWithParameters {
    static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetByName("Alice"); // Output: Hello, Alice!
        greetByName("Bob"); // Output: Hello, Bob!
    }
}
