//What is A.P. (Arithmetic Progression)?
//
//        A.P. is the series of terms having the first term as a and d, common difference. Every next term in the A.P. is greater than the previous term by d units.
//
//        Example –
//
//        -2, 3 , 8 , 13 , 18 , 23 , 28 , 33
//
//        First term , a = – 2
//
//        Common Difference , d=5
//
//        Last term , an=33

package Numbers;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=ip.nextInt();
        System.out.print("How Many Number you want: ");
        int totalnum = ip.nextInt();
        System.out.print("Enter Difference Between Numbers: ");
        int diff = ip.nextInt();
        int sum =0;
        for (int i = 1; i <=totalnum ; i++) {
            sum+=num1;
            num1+=diff;
        }
        System.out.println("Sum: "+sum);
    }
}













