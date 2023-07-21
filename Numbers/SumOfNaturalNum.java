package Numbers;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            sum+=i;
        }


        System.out.println(sum);
    }
}
