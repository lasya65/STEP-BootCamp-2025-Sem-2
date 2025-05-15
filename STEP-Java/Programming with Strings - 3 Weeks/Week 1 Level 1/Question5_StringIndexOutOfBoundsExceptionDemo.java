import java.util.Scanner;

public class Question5_StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String str) {
        // This will throw StringIndexOutOfBoundsException if index is out of range
        System.out.println(str.charAt(str.length()));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Uncomment to generate exception (program will stop)
        // generateException(input);

        // Handle exception gracefully
        handleException(input);

        scanner.close();
    }
}
