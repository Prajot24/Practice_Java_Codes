package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommanArray {
    public static void main(String[] args) {
        int a[] = {1,4,5,6,8};
        int b[] = {2,5,7,6,9};
        boolean c = false;
        //List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],i);
        }
        for (int i = 0; i < b.length; i++) {
            if(!map.containsKey(b[i])){
                System.out.print(b[i]+" ");
            }
        }


    }
}
