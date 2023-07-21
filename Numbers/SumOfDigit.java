package Numbers;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 1234;
        int sum =0;
        int d;
        while(num>0){
            d= num%10;
            sum+=d;
            num/=10;
        }
        System.out.println(sum);
    }
}
