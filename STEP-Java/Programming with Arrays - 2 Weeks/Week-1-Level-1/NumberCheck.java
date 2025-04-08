/*Q2: Write a program to take user input for 5 numbers and check whether a number is positive,negative, 
or zero. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less */

import java.util.Scanner;

public class NumberCheck {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers separated by spaces:");
        for (int i = 0; i < 5; i++) numbers[i] = scanner.nextInt();
        
        for (int num : numbers)
            System.out.println(num + (num > 0 ? (num % 2 == 0 ? " is positive and even." : " is positive and odd.") : num < 0 ? " is negative." : " is zero."));
        
        System.out.println("First element " + numbers[0] + (numbers[0] > numbers[4] ? " is greater than " : numbers[0] < numbers[4] ? " is less than " : " is equal to ") + "last element " + numbers[4] + ".");
        
        scanner.close();
    }
}
