import java.util.Scanner;

public class Question10_LowercaseConversion {

    public static String toLowerCaseUsingCharAt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else {
                sb.append(ch);
            }
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

        System.out.print("Enter the complete text: ");
        String input = scanner.nextLine();

        String lowerCharAt = toLowerCaseUsingCharAt(input);
        String lowerBuiltIn = input.toLowerCase();

        System.out.println("Lowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);

        boolean isEqual = compareUsingCharAt(lowerCharAt, lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + isEqual);

        scanner.close();
    }
}
