package Exercise2;
import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = num.nextInt();

        int squre = number * number;
        int cube = number * number * number;
        double fourthPower = Math.pow(number, 4);
        System.out.println("Square: " + squre);
        System.out.println("Cube: " + cube);
        System.out.println("ForthPower: " + fourthPower);
    }

}
