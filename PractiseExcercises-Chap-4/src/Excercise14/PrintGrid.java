package Excercise14;

public class PrintGrid {
    public static void main(String[] args) {
        String horizontal = "+--+--+--+\n";
        String vertical = "|  |  |  |\n";
        for (int i = 0; i < 3; i++) {
            System.out.println(horizontal);
            System.out.println(vertical);
        }
        System.out.println(horizontal);
    }
    }

