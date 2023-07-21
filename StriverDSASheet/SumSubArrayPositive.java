package StriverDSASheet;

public class SumSubArrayPositive {
    public static void main(String[] args) {
        int a[] = {2,5,7,9,1,4,70};
        int sum = 0;
        int max=0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum+=a[j];

            }
            max= sum;

            break;
            //System.out.println();
            //sum = 0;
        }
        System.out.println("Maximum of subarray: "+ max);


    }
}
