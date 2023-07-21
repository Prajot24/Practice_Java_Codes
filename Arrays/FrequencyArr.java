package Arrays;

import java.util.Scanner;

public class FrequencyArr {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = ip.nextInt();
        int count = 0;

        int[] arr= {12,3,5,67,89,9,3,4,5,6,7,3,2,4,6,8,99,8,};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) {
                count++;
            }
        }
        if(count==0){
            System.out.print("Element Not Found");
        }else
        System.out.print(count);

    }
}
