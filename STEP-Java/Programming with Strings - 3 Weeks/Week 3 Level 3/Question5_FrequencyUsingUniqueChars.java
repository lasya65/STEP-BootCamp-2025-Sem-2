import java.util.Scanner;

public class Question5_FrequencyUsingUniqueChars {

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

    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findFrequencyUsingUniqueChars(String str) {
        char[] uniqueChars = findUniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findFrequencyUsingUniqueChars(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }

        scanner.close();
    }
}
