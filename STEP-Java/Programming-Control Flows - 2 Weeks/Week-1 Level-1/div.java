/*Q1: Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___*/

import java.util.Scanner;

public class div {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Is the number " + num + " is divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + num + " is divisible by 5? No");
        }
    }
}