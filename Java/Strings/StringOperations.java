public class StringOperations {
    public static void main(String[] args) {
        // checks if a string is empty
        System.out.println("".isEmpty()); // true
        // returns the length
        System.out.println("Java".length()); // 4
        // returns the character based on index
        System.out.println("Java".charAt(0)); // J
        // starts at the first index and prints the rest
        System.out.println("Java".substring(1)); // ava
        // starts at the first index and excludes the last index
        System.out.println("Java".substring(1, 3)); // av
        // Join the two or more strings
        System.out.println("Java".concat(" Program")); // Java Program
        // Compares the two strings strict comparision
        System.out.println("Java".equals("java")); // false
        // Compares the two strings loose comparision
        System.out.println("Java".equalsIgnoreCase("java")); // True
        // Converts the string to lower case
        System.out.println("Java".toLowerCase()); // java
        // Converts the string to UPPER CASE
        System.out.println("Java".toUpperCase()); // JAVA
        // Trims out the spaces around the string
        System.out.println("   Java   ".trim()); // Java
        // Replaces every occurence of old with new character
        System.out.println("Java".replace('a', 'o')); // Jovo
        // Splits the java string into array of substrings
        String[] myArray = "Java".split("");
        for (String s : myArray) {
            System.out.println(s); // J a v a
        }
    }
}
