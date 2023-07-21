package Arrays;

import java.util.Arrays;

public class CosecutiveSequence {
    public static void main(String[] args) {

        int arr[] ={100, 200, 1, 3, 2, 4,3,3};
        int count =1;
        int ans =0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            ans+=arr[i];


        }
        System.out.println(ans);
    }
}
