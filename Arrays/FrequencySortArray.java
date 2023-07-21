package Arrays;

public class FrequencySortArray {
    public static void main(String[] args) {
        int[] arr = {8,7,5,3,8,2,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    //System.out.println("Before Swap: "+arr[i]+" "+arr[j]);

                    int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    //System.out.println("After Swap: " + arr[i]+" "+arr[j]);
                }
            }
        }

        for (int x:arr) {
            System.out.print(x+" ");
        }

    }
}
