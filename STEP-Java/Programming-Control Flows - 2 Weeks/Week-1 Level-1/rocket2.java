/*Q9: Rewrite program 8 to do the countdown using the for-loop */

import java.util.Scanner;

public class rocket2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blast off!");
    }
}