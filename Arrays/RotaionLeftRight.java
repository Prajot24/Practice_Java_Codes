package Arrays;

import java.util.Scanner;

public class RotaionLeftRight {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int num=ip.nextInt();
        while(num>=1) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {

                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            num--;
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }

    }
}
