package Excercise7;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int[] value = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            value[i] = in.nextInt();
        }
        for (int i = 9; i>=0; i--){
            System.out.print(value[i] + " ");
        }
    }




}
