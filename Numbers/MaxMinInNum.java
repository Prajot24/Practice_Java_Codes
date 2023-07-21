package Numbers;

import java.util.Scanner;

public class MaxMinInNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int temp;
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while (num>0){
            temp=num%10;
            if(temp<min){
                min=temp;}

            if(temp>max){
                max=temp;
            }
            num/=10;
        }
        System.out.println("Minimum :"+min);
        System.out.println("Maximum :"+max);
    }
}
