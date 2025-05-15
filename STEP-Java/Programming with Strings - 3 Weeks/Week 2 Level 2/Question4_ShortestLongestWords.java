import java.util.Scanner;

public class Question4_ShortestLongestWords {

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
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = splitUsingCharAt(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        int[] shortestLongestIndices = findShortestLongest(wordsWithLengths);

        System.out.println("Shortest word: " + wordsWithLengths[shortestLongestIndices[0]][0] +
                " (Length: " + wordsWithLengths[shortestLongestIndices[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLengths[shortestLongestIndices[1]][0] +
                " (Length: " + wordsWithLengths[shortestLongestIndices[1]][1] + ")");

        scanner.close();
    }
}
