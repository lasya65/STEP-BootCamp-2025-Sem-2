/*Q2- Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
Input must be: base, height
Output must be: Your Height in cm is ___ while in feet is ___ and inches is ___*/

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle is: " + area + " square inches");
        double area_cm = area * 2.54 * 2.54;
        System.out.println("Area of the triangle is: " + area_cm + " square centimeters");
    }
}