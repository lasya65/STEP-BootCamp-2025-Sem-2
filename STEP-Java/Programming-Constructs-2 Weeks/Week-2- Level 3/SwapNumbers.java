// Swap Two Numbers
import java.util.Scanner;
public class SwapNumbers {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swapped numbers: first number = " + num1 + ", second number = " + num2);
        scanner.close();
    }
}

/*
Sample Input/Output:
Enter first number: 56
Enter second number: 65
Swapped numbers: first number = 65.0, second number = 56.0
*/