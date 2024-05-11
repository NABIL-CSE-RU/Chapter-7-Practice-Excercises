package Exercise5;
import java.util.Scanner;

import static Exercise5.Constants.*;

public class Distence {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Distance In Meter: ");
        double number = num.nextDouble();
        double Meter_To_Mile = number * Mile;
        double Meter_To_Feet = number * Feet;
        double Meter_To_Inches = number * Inch;
        System.out.println("Meter_To_Mile: " + Meter_To_Mile);
        System.out.println("Meter_To_Feet: " + Meter_To_Feet);
        System.out.println("Meter_To_Inches: " + Meter_To_Inches);
    }
}
