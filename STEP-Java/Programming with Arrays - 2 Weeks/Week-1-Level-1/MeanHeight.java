/*Q6: Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team*/

import java.util.Scanner;

public class MeanHeight {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11]; // Array to store heights of 11 players
        double sum = 0;

        // Taking input from user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Adding each height to sum
        }
        
        scanner.close();

        // Calculating mean height
        double mean = sum / 11;

        // Printing the result
        System.out.printf("The mean height of the football team is: %.2f\n", mean);
    }
}
