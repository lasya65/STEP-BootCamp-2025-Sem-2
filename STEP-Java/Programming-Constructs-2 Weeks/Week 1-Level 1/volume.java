/*Q7-Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____ */


public class volume {
    public static void main(String[] args) {
        double r= 6378;
        double volumeKm = (4/3 * Math.PI * Math.pow(r, 3));
        double volumeMiles = volumeKm * 0.621371;   // 1 km = 0.621371 miles  
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}