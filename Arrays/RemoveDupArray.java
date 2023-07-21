package Arrays;



import java.util.HashMap;

public class RemoveDupArray {
    public static void main(String[] args) {
        int arr[] ={12,12,4,5,6,5,4,6,3};
        HashMap<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                continue;
            }else{
                System.out.print(arr[i]+" ");//Print in unsorted way
                map.put(arr[i],i );
            }
        }
        System.out.println(map.keySet());//printin sorted way
    }
}
