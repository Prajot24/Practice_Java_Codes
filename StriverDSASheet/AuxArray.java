package StriverDSASheet;

public class AuxArray {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = {17, 20, 11, 9, 12, 6};
        int aux[] = new int[arr.length];
        int profit = 0;
        int maxprofit= Integer.MIN_VALUE;
        int a=0, b=0;
           // aux[arr.length-1]=arr[arr.length-1];


        for (int i = arr.length-1; i >=0 ; i--) {
                if(max<arr[i]){
                    max = arr[i];
                    aux[i]=max;
                }else{
                    aux[i]=max;
                }
        }

        for (int i = 0; i < arr.length; i++) {
            profit=aux[i]-arr[i];
            if(profit>maxprofit){
                maxprofit=profit;
                a=aux[i] ; b=arr[i];
            }
        }
        System.out.println(maxprofit);
        System.out.println("Element a and b: "+b+" "+a);
    }
}
