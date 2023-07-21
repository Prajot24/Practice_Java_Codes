package Arrays;

public class MedianArray {
    public static void main(String[] args) {
        double arr[]={12,4,6,8,3,9,2,7,14,5,6,12,15};
        double med;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    double temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (double x:arr
             ) {
            System.out.print(x+" ");
        }
        System.out.println();

        if(arr.length%2==0){
            double a=arr[arr.length/2];
            double b= arr[(arr.length-1)/2];
            System.out.println(a);
            System.out.println(b);
            med = ((a+b)/2);
        }else{
            med= (arr[arr.length/2]);
        }

        System.out.println("median: "+med);
    }
}
