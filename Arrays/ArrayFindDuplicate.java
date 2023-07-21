package Arrays;

public class ArrayFindDuplicate {
    public static void main(String[] args) {
        int arr[] = {12,3,4,6,8,9,12,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
