/*Q6- Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___*/

import java.util.Scanner;

public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = sc.nextDouble();
        double quotient = number1 / number2;
        double reminder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + number1 + " and " + number2);
    }
}
