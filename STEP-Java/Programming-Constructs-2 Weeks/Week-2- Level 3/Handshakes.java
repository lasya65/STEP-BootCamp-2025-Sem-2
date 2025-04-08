// Maximum Handshakes
import java.util.Scanner;
public class Handshakes {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int handshakes = students * (students - 1) / 2;
        System.out.println("Total handshakes: " + handshakes);
        sc.close();
    }
}

/*
Sample Input/Output:
Enter number of students: 45
Total handshakes: 990
*/
