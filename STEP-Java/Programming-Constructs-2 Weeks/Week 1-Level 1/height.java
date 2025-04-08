/* Q10- Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */


import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {
        
        // Prompt user for height input
        System.out.print("Enter your height in centimeters: ");
        double height = input.nextDouble();
        
        // Convert height to feet and inches
        double feet = height / 30.48;
        double inches = (height / 2.54) % 12;
        
        // Display the results
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", height, feet, inches);
        
        // Close the scanner
        }
    }
}   