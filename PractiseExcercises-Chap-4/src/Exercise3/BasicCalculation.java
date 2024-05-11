package Exercise3;
import java.util.Scanner;
public class BasicCalculation {
    public static void main(String[] args) {
       Scanner num1 = new Scanner(System.in) ;
        System.out.println("Enter First Number:");
       int number1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in) ;
        System.out.println("Enter First Number:");
        int number2 = num2.nextInt();

       int Sum = number1 + number2;
       int defference = number1 - number2;
       int product = number1 * number2;
       double average = (number1 + number2) / 2;
       int absdifference = Math.abs(number1 - number2);
       int maximum = Math.max(number1, number2);
       int minimum = Math.min(number1, number2);
        System.out.println("Sum: " + Sum);
        System.out.println("Product: " + product);
        System.out.println("Deffence: " + defference);
        System.out.println("Average: " + average);
        System.out.println("Absdefference: " + absdifference);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

    }
}
