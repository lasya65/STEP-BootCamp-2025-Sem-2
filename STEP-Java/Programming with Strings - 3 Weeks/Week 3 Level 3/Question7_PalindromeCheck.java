import java.util.Scanner;

public class Question7_PalindromeCheck {

    public static boolean isPalindromeLogic1(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(str, start + 1, end - 1);
    }

    public static char[] reverseStringUsingCharAt(String str) {
        int length = str.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = str.charAt(length - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindromeLogic3(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseStringUsingCharAt(str);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        System.out.println("Palindrome check using logic 1: " + isPalindromeLogic1(input));
        System.out.println("Palindrome check using logic 2: " + isPalindromeLogic2(input, 0, input.length() - 1));
        System.out.println("Palindrome check using logic 3: " + isPalindromeLogic3(input));

        scanner.close();
    }
}
