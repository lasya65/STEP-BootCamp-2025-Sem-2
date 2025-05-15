
// Travel Computation
import java.util.Scanner;
public class TravelComputation {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        @SuppressWarnings("unused")
        String name = sc.next();
        System.out.print("Enter from city: ");
        @SuppressWarnings("unused")
        String fromCity = sc.next();
        System.out.print("Enter via city: ");
        @SuppressWarnings("unused")
        String viaCity = sc.next();
        System.out.print("Enter distance and time (from city to via city): ");
        double distance1 = sc.nextDouble();
        double time1 = sc.nextDouble();
        System.out.print("Enter final city: ");
        @SuppressWarnings("unused")
        String finalCity = sc.next();
        System.out.print("Enter distance and time (via city to final city): ");
        double distance2 = sc.nextDouble();
        double time2 = sc.nextDouble();
        System.out.println("Total Distance: " + (distance1 + distance2) + " km, Total Time: " + (time1 + time2) + " minutes");
        sc.close();
    }
}

/*
Sample Input/Output:
Enter your name: Sara
Enter from city: Chandigarh
Enter via city: Delhi
Enter distance and time: 120 40
Enter final city: Haryana
Enter distance and time: 140 50
Total Distance: 260.0 km, Total Time: 90.0 minutes
*/