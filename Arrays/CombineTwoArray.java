package Arrays;

import java.util.HashMap;

public class CombineTwoArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,7,8};
        int b[] = {2,5,6,8};
        int len = a.length+b.length;
        int arr[] = new int[len];
        System.out.println(len);
        for (int i = 0; i < a.length; i++) {
            arr[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {

            arr[a.length+i]=b[i];
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i])){
//                continue;
//            }else {
//                map.put(arr[i],i);
//            }
//        }
//        System.out.println(map.keySet());
        
    }
}
