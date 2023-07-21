package StriverDSASheet;

public class OptimalOpp {
    public static void main(String[] args) {
        int max =0, profit = 0;

        int arr[] = {4,2,1,3,6,4,2,4};
        int minbuy = arr[0];

        for (int i = 0; i < arr.length; i++) {
            profit = arr[i]-minbuy;
            if(minbuy>arr[i]){
                minbuy=arr[i];
                System.out.println("minbuy"+minbuy);
            }
            if(profit>max){
                max=profit;
            }
        }
        System.out.println(max);

    }
}
