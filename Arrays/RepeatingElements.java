package Arrays;

import java.util.HashMap;

public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = {2,1,1,1,1,2,3,4,3,5,7,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                map.put(arr[i],i);
            }
            count=0;
        }
        System.out.println(map.keySet());
    }
}
