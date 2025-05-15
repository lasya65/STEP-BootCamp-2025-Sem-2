import java.util.Scanner;

public class Question3_FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < length; i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
