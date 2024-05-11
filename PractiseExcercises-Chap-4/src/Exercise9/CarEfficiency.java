package Exercise9;

import java.util.Scanner;

public class CarEfficiency {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(" The number of gallons of gas in the tank: ");
        double gallon = num.nextDouble();
        Scanner eff = new Scanner(System.in);
        System.out.println("The fuel efficiency in miles per gallon: ");
        double fuelEfficiency = eff.nextDouble();
        Scanner gas = new Scanner(System.in);
        System.out.println("The price of gas per gallon: ");
        double price = gas.nextDouble();

        double PricePer100miles = fuelEfficiency * 100 * price ;
        double Distance = gallon / fuelEfficiency ;
        System.out.println("PricePer100miles: " + PricePer100miles + " TaKa");
        System.out.println("Distance: " + Distance + " Miles");
    }


}
