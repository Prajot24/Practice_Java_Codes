package Arrays;

import java.util.Scanner;

public class InsertionArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int index =ip.nextInt();
        int arr[]={12,4,6,8,9,3} ;
        int newarr[]=new int[arr.length+1];
        for (int i = 0,j=0; i < newarr.length ; i++) {
            if(i==index){
                newarr[i]=num;
            }else{
                newarr[i]=arr[j];
                j++;
            }
        }

        for (int x:newarr) {
            System.out.print(x+" ");
        }

    }
}
