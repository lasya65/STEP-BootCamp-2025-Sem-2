// Athlete Running in Triangular Park
import java.util.Scanner;
public class TriangularPark {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = 5000 / perimeter;
        System.out.println("Number of rounds needed: " + rounds);
        sc.close();
    }
}

/*
Sample Input/Output:
Enter three sides: 9 8 7
Number of rounds needed: 49
*/
