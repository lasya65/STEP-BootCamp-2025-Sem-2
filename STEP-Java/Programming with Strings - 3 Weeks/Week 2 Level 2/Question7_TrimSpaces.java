import java.util.Scanner;

public class Question7_TrimSpaces {

    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 for substring end index
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] trimIndices = trimSpaces(input);
        String trimmedUserDefined = substringUsingCharAt(input, trimIndices[0], trimIndices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Trimmed using charAt(): '" + trimmedUserDefined + "'");
        System.out.println("Trimmed using trim(): '" + trimmedBuiltIn + "'");

        boolean isEqual = compareUsingCharAt(trimmedUserDefined, trimmedBuiltIn);
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
