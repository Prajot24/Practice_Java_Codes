package Arrays;

public class RankArray {
    public static void main(String[] args) {
        int arr[]= {12,4,6,8,2,1};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];
        }
        //Sort new Array
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                if(newarr[i]<newarr[j]){
                    int temp = newarr[i];
                    newarr[i]=newarr[j];
                    newarr[j]=temp;
                }
            }
        }
        for (int x:newarr) {
            System.out.println(x+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                if(arr[i]==newarr[j]){
                    arr[i]=j+1;

                }
            }
        }

        for (int x:arr) {
            System.out.print(x+" ");
        }


    }
}
