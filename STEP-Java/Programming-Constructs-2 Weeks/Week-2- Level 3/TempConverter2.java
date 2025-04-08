// Temperature Conversion (Fahrenheit to Celsius)
import java.util.Scanner;
public class TempConverter2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 0.5556;
        System.out.println("The Celsius temperature is: " + celsius + "C");
        scanner.close();
    }
}

/*
Sample Input/Output:
Enter the temperature in Fahrenheit: 273
The Celsius temperature is: 133.06C
*/