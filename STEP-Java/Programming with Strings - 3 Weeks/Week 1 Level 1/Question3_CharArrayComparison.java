import java.util.Arrays;
import java.util.Scanner;

public class Question3_CharArrayComparison {

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.next();

        char[] userDefinedChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        System.out.println("User-defined char array: " + Arrays.toString(userDefinedChars));
        System.out.println("Built-in char array: " + Arrays.toString(builtInChars));

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Are both char arrays equal? " + areEqual);

        scanner.close();
    }
}
