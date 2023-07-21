package Arrays;

public class AvgArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        float avg;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/arr.length;

        System.out.println(avg);
    }
}
