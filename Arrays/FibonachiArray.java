package Arrays;

import java.util.Scanner;

public class FibonachiArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        long arr[] =new long[num];

        for (int i = 0; i <num; i++) {
            if(i<2){
                arr[i]=i;
                System.out.println("Index num: "+arr[i]);
            }else{
                arr[i]=arr[i-1]+arr[i-2];
            }

        }
        for (long x:arr) {
            System.out.print(x+" ");
        }
    }
}
