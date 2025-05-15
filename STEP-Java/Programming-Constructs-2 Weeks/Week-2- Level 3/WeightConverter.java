// 10. Create a program to convert weight in pounds to kilograms.
// Solution:
import java.util.Scanner;
public class WeightConverter{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds =");
        double weight = sc.nextDouble();
        double weightInKg = weight / 2.2;
        System.out.println("The weight in pounds = " + weight + " pounds, now weight in kilograms = " + weightInKg + " Kg");
        sc.close();
    }
}

/*
Sample Input/Output:
Enter the weight in pounds = 15
The weight in pounds = 15.0 pounds, now weight in kilograms = 6.818181818181818 Kg
*/
