package StriverDSASheet;

import java.util.Scanner;

public class RightShiftArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        int arr[][]= {{1,2,3},
                      {4,5,6},
                      {7,8,9,}};


        while(k>0) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][arr.length - 1];
                for (int j = arr[0].length - 1; j > 0; j--) {

                    arr[i][j] = arr[i][j - 1];
                }
                arr[i][0] = temp;
            }
            k--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
