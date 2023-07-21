package Arrays;

import java.util.Scanner;

public class OrderArray {
    public static void main(String[] args) {
        int[] arr ={12,4,6,8,34,2,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int x:arr
             ) {
            System.out.print(x+" ");

        }
    }
}
