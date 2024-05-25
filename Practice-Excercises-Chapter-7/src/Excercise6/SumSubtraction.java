package Excercise6;
import java.util.Scanner;
public class SumSubtraction {
    int[] value = new int[10];
    public SumSubtraction() {
        scan();
    }
    public void scan(){

        Scanner in = new Scanner(System.in);
        for(int i =0; i<10; i++){
            value[i] = in.nextInt();
        }
    }
    public int getGrandTotal() {
        int sum = 0,sub =0;
        for(int i = 0; i <10; i++){
            if(i %2==0){
                sum = sum + value[i];
            }
            else sub = sub + value[i];
        }
        return sum - sub;
    }
}
