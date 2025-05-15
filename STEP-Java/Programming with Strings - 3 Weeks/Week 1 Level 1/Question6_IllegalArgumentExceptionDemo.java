import java.util.Scanner;

public class Question6_IllegalArgumentExceptionDemo {

    public static void generateException(String str) {
        // This will throw IllegalArgumentException if start > end
        System.out.println(str.substring(5, 2));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
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
