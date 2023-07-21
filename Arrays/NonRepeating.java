package Arrays;

import java.util.HashMap;



public class NonRepeating {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,2,-2,4,5,2,-2,1,14};
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
//                    System.out.println("Count: "+count);
                }
            }
            if(count<2){
                System.out.print(arr[i]+" ");
            }
            count=0;
        }
        //System.out.print(map.keySet());
    }
}
