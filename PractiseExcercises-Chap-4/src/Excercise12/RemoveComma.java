package Excercise12;

import java.util.Scanner;

public class RemoveComma {
    public String num;

    public RemoveComma() {
        func();
    }
    public void func(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        num = scanner.next();
    }

    public String getNum() {
        String OutputNumber = " ";
            for(int i=0; i<num.length(); i++){
                if(num.charAt(i) != ','){
                    OutputNumber = OutputNumber + num.charAt(i);
                }
            }

        return OutputNumber;
    }
}
