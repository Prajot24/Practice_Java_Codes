package StriverDSASheet;

public class ZeroArrangeFirst {
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,9,0,3,0,2,0};

        int low = 0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==0){
                int temp = arr[i];
                    arr[i] = arr[low];
                    arr[low]=temp;
                    low++;
            }

        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
