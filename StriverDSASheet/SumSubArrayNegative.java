package StriverDSASheet;

public class SumSubArrayNegative {
    public static void main(String[] args) {
        int a[] = {10, 20, -30, 40, -50, 60};
        int len = a.length;
        int sum =  0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len ; j++) {
                sum+=a[j];
                System.out.print(sum+" ");
                if(max<sum){
                    max=sum;
                }

            }
            System.out.println();
            sum = 0;

        }
        System.out.println(max);
    }
}
