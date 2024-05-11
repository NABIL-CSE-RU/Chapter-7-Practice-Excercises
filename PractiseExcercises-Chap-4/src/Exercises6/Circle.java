package Exercises6;
import java.util.Scanner;
public class Circle {
    public static final double PI = 3.1416;
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double Radius = num.nextDouble();
        double Area = Radius * PI * PI;
        double Circumstance = 2 * PI * Radius;
        System.out.println("Area: " + Area);
        System.out.println("Circumstance: " + Circumstance);
    }
}
