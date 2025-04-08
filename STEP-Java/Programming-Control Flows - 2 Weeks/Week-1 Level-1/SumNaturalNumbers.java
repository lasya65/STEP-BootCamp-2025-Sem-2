/*Q12: Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result*/

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Checking if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Computing sum using while loop
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            
            // Computing sum using formula
            int sumFormula = n * (n + 1) / 2;
            
            // Displaying results
            System.out.println("Sum calculated using while loop: " + sumLoop);
            System.out.println("Sum calculated using formula: " + sumFormula);
            
            // Comparing results
            if (sumLoop == sumFormula) {
                System.out.println("Both computations match. The sum is correct!");
            } else {
                System.out.println("There is an error in computation.");
            }
        }
        
        scanner.close();
    }
}
