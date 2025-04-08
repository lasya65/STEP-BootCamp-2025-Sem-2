/*Q1- Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___*/
import java.util.Scanner;
public class calc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        float sub = num1 - num2;
        float mul = num1 * num2;
        float div = num1 / num2;
        System.out.println("The addition value of 2 numbers " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The subtraction value of 2 numbers " + num1 + " and " + num2 + " is " + sub);
        System.out.println("The multiplication value of 2 numbers " + num1 + " and " + num2 + " is " + mul);
        System.out.println("The division value of 2 numbers " + num1 + " and " + num2 + " is " + div);
    }
}