package Numbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double input = ip.nextInt();

        int num = (int) input;

        String n = Integer.toString(num);
        double sum = 0;
        for (int i = 1; i <=n.length() ; i++) {
             sum = Math.pow(num%10,n.length())+sum;
            num/=10;
        }
        System.out.println("sum :"+ sum);
        if(sum==input){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
