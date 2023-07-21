package Numbers;
/////
//For Eg.
//
//        a= 2, r=2, n=4
//
//        Initially , sum=0
//
//        First Term , a=2 , sum=2
//
//        Second Term , ar=4 , sum=6
//
//        Third Term , ar2=8, sum=14
//
//        Fourth / Last Term , ar3=16 , sum=30
//
//        Finally , sum is 30
////
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = ip.nextDouble();
        System.out.print("Enter Ratio Between Numbers: ");
        double ratio = ip.nextDouble();
        System.out.print("Enter how many numbers u  Numbers: ");
        int total = ip.nextInt();
        double sum =0;
        for (int i = 1; i <=total ; i++) {
            sum+=num1;
            num1=num1*ratio;
        }
        System.out.print(sum);
    }
}
