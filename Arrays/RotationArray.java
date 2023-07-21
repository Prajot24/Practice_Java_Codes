package Arrays;

import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();

        int arr[] = {0,1,2,3,4,5,6,7,8,9};

        while(num>=1){
            int first= arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1] = first;
            num--;
        }


        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
