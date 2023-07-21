package Numbers;
//We can find the proper divisors of a given number. If their sum is equal to the given number then it is a perfect number.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int temp = num;
        int sum = 0;
        for (int i = 1; i <temp ; i++) {
            if(num%i==0){
                sum +=i;
            }

        }
        System.out.println("Sum :"+sum);
        if (num==sum){
            System.out.println("Number Is Perfect");
        }else{
            System.out.println("Number Is  Not Perfect");
        }
    }
}


