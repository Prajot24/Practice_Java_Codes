package Numbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();


//        for (int i =10 ; i <=50 ; i++) {
////            int temp= i;
////            int numrev=0;
////            while(temp>0){
////                numrev=numrev*10+(temp%10);
////                temp/=10;
////            }
////            if(i==numrev){
////                System.out.println(i);}
////        }
        int count = 0;
        while(n>0){
            n=n/10;
            count ++;
        }

        System.out.println(count++);
    }
}
