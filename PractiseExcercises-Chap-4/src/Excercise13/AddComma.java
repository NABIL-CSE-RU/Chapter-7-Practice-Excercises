package Excercise13;

import java.util.Scanner;

public class AddComma {
    public String num;

    public AddComma() {
        func();
    }
    public void func(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        num = scanner.next();
    }

    public String getNum() {
        String OutputNumber = " ";
        for( int i=num.length(); i>num.length() ; i--){

        }
        return OutputNumber;
    }
}
