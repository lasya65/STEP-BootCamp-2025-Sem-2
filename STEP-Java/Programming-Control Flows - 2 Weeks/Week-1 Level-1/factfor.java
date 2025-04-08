/*Q15: Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. */

import java.util.Scanner;

public class factfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Checking if input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Computing factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Displaying result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
}