import java.util.Scanner;

public class Question1_StringLengthWithoutLengthMethod {

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught, return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        int lengthUserDefined = getStringLength(input);
        int lengthBuiltIn = input.length();

        System.out.println("Length using user-defined method: " + lengthUserDefined);
        System.out.println("Length using built-in length(): " + lengthBuiltIn);

        scanner.close();
    }
}
