import java.util.Arrays;
import java.util.Scanner;

public class Question2_SplitTextWithoutSplitMethod {

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

    public static String[] splitUsingCharAt(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        // Add last word
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] userSplit = splitUsingCharAt(input);
        String[] builtInSplit = input.split(" ");

        System.out.println("User-defined split: " + Arrays.toString(userSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));

        boolean isEqual = compareStringArrays(userSplit, builtInSplit);
        System.out.println("Are both splits equal? " + isEqual);

        scanner.close();
    }
}
