package Excercise2;

import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        int[] value = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            value[i] = in.nextInt();
        }
        System.out.println();
        for(int i = 0; i<10; i=i+2){
            System.out.print(value[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<10; i++){
            if(value[i]%2==0){
                System.out.print(value[i] + " ");
            }
        }
        System.out.println();
        for(int i =9; i>=0; i-- ){
            System.out.print(value[i] + " ");
        }
        System.out.println();
        System.out.println(value[0]);
        System.out.println(value[9]);
    }
}
