import java.util.Scanner;

public class Question6_VowelConsonantCharType {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static String checkCharType(char ch) {
        if (!Character.isLetter(ch)) {
            return "Not a Letter";
        }
        return isVowel(ch) ? "Vowel" : "Consonant";
    }

    public static String[][] getCharTypes(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] charTypes = getCharTypes(input);
        displayTable(charTypes);

        scanner.close();
    }
}
