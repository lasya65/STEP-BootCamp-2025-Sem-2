import java.util.Scanner;

public class Question8_ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String[] names) {
        // This will throw ArrayIndexOutOfBoundsException if index is out of range
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Uncomment to generate exception (program will stop)
        // generateException(names);

        // Handle exception gracefully
        handleException(names);

        scanner.close();
    }
}
