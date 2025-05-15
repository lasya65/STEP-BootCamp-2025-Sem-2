import java.util.*;

class HandshakeFormula {
    public int calculateUsingCombination(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        HandshakeFormula obj = new HandshakeFormula();
        int result = obj.calculateUsingCombination(n);
        System.out.println("Handshakes using combination formula: " + result);
    }
}