package Arrays;

public class SumArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
