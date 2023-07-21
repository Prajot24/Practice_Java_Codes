package StriverDSASheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ZeroArrange {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,4,6,0,0,2,3,0};
        int last = arr.length-1;
        int mid = 0;
        while(mid<=last){
            if(arr[mid]==0){
                int temp = arr[mid];
                    arr[mid]= arr[last];
                    arr[last]=temp;
                    last--;
            }else{
                mid++;
            }
        }
        for (int x: arr) {
            System.out.print(x+" ");
        }


        // ArrayList

    }
}
