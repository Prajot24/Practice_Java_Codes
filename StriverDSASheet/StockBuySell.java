package StriverDSASheet;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {2,4,7,1,8,3,2,1};
        int profit =0;
        int sellprice = 0;
        int max = 0;
        int buymin = arr[0];
     for (int i = 0; i < arr.length ; i++) {
            profit = arr[i]-buymin;
            if(arr[i]<buymin){
                buymin = arr[i];
            }
            if(profit>max){
                max=profit;
                sellprice = arr[i];
            }
        }
        System.out.println(sellprice+" "+buymin+" = "+max);

    }
}
