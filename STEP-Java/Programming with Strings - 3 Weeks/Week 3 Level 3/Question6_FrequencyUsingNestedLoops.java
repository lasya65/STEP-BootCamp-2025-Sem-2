import java.util.Scanner;

public class Question6_FrequencyUsingNestedLoops {

    public static String[][] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];
        boolean[] visited = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (visited[i]) continue;
            freq[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    visited[j] = true;
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (!visited[i]) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                result[index][0] = Character.toString(chars[i]);
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

        String[][] frequencies = findFrequency(input);

        System.out.println("Character\tFrequency");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }

        scanner.close();
    }
}
