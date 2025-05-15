/* Q9- Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPercent
O/P => The discount amount is INR ___ and final discounted fee is INR ___ */

import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        try (Scanner input = new Scanner(System.in)) {
        
        // Prompt user for fee input
        System.out.print("Enter the total fee amount (INR): ");
        double fee = input.nextDouble();
        
        // Prompt user for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate the final fee after discount
        double finalFee = fee - discount;
        
        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
        
        // Close the scanner
        }
    }
}
