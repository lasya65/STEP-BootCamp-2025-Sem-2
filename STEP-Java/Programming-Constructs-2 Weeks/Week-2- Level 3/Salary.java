// Calculate Total Income
import java.util.Scanner;
public class Salary {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the Bonus: ");
        double bonus = scanner.nextDouble();
        double totalSalary = salary + bonus;
        System.out.println("Your total salary = " + totalSalary);
        scanner.close();
    }
}

/*
Sample Input/Output:
Enter the Salary: 300000
Enter the Bonus: 50000
Your total salary = 350000.0
*/