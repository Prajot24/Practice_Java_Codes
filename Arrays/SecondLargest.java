package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] ={12,34,11,56,76,23,8,9,12,74};
        int max1,max2;
        max1=max2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("First Max Is: "+max1);
        System.out.println("Second Max Is: "+max2);
    }
}
