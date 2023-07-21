package Arrays;

public class MaxNMin {
    public static void main(String[] args) {
        int arr[]= {54, 546, 548, 60,10,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.print("max: "+max+" ");
        System.out.print("min: "+min);
    }
}
