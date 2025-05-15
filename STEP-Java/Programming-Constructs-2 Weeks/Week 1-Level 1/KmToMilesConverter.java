/* Q8- Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km*/

import java.util.Scanner;

public class KmToMilesConverter {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Declare variable to store kilometers
        double km;
        
        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        
        // Conversion formula: 1 mile = 1.6 km
        double miles = km / 1.6;
        
        // Display the result
        System.out.printf("The total miles is %.2f miles for the given %.2f km\n", miles, km);
        
        // Close scanner
        input.close();
    }
}
