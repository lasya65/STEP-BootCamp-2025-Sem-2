/*Q13: Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result*/


import java.util.Scanner;

public class sumfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Checking if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Computing sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            
            // Computing sum using formula
            int sumFormula = n * (n + 1) / 2;
            
            // Displaying results
            System.out.println("Sum calculated using for loop: " + sumLoop);
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
