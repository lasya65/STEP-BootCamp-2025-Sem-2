import java.util.Scanner;

public class Question4_CharFrequency {

    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            freq[str.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharFrequency(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }

        scanner.close();
    }
}
