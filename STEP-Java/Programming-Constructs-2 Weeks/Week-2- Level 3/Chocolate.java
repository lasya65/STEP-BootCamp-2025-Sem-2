// Chocolate Distribution
import java.util.Scanner;
public class Chocolate {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();
        System.out.println("Each child gets: " + (chocolates / (double) children));
        sc.close();
    }
}

/*
Sample Input/Output:
Enter chocolates: 30
Enter children: 25
Each child gets: 1.2
*/