package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,4,5,6,84,9};
        int str = arr.length-1;
        int[] arrN = new int[arr.length];
        for (int i = arr.length-1, j=0; i >=0 ; i--,j++) {

                arrN[j]=arr[i];

        }

        for (int x:arrN) {
            System.out.print(x+" ");
        }
    }
}
