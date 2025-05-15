/*Q14: Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.*/

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Checking if input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Computing factorial using while loop
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            
            // Displaying result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
}
