package Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] arr= {1,5,7,4,5};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
