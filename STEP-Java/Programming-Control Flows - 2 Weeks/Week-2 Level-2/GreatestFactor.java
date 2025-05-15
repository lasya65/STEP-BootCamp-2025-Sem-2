// 8. Find the greatest factor of a number.
// Solution:
import java.util.Scanner;
class GreatestFactor {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                System.out.println("Greatest factor: " + i);
                break;
            }
        }
        input.close();
    }
}
