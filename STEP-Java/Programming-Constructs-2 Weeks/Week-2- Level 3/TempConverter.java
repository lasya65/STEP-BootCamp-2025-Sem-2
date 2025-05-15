// Temperature Conversion (Celsius to Fahrenheit)
import java.util.Scanner;
public class TempConverter {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit + "F");
        scanner.close();
    }
}

/*
Sample Input/Output:
Enter the temperature in Celsius: 100
The temperature in Fahrenheit is: 212.0F
*/