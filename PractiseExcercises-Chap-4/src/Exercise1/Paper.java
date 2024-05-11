package Exercise1;

public class Paper {
    public static final double Inch_To_MM = 25.4;
    public static void main(String[] args) {

        double height = 11 * Inch_To_MM;
        double width = 8.5 * Inch_To_MM;

        double perimeter = 2 * (height + width);
        double LengthofDiagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.println("Height:" + height);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + LengthofDiagonal);

    }
}
