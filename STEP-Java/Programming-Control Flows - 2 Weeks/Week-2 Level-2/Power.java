// 9. Compute power of a number.
// Solution:
import java.util.Scanner;
class PowerOfNumber {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
        input.close();
    }
}
