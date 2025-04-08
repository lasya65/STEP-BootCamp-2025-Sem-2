/*Q11: Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;*/

import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n <= 0) {
                break;
            }
            sum += n;
        }
        System.out.println("The sum is: " + sum);
    }
}