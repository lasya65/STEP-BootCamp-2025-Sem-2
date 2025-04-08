/*Q7: Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index*/

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Error: Enter a natural number.");
            return;
        }
        
        int[] even = new int[number / 2 + 1], odd = new int[number / 2 + 1];
        int eIdx = 0, oIdx = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[eIdx++] = i;
            else odd[oIdx++] = i;
        }
        
        System.out.print("Even numbers: ");
        for (int i = 0; i < eIdx; i++) System.out.print(even[i] + " ");
        
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oIdx; i++) System.out.print(odd[i] + " ");
    }
}
