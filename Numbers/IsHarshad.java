package Numbers;

public class IsHarshad {
    public static void main(String[] args) {
        int num = 379;
        int d;
        int m=0;
        int temp = num;
        while (num>0){
            d=num%10;
            m= m+d;
            num/=10;
        }
        if(temp%m==0){
            System.out.println("Number Is Harshad");
        }else{
            System.out.println("Number Is not Harshad");
        }
    }
}
