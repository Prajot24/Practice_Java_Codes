package Numbers;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = ip.nextInt();
        System.out.print("Enter Power: ");
        int pov = ip.nextInt();
        int Result=1;
        for (int i = 1; i <=pov; i++) {
            Result=Result*num;
        }
        System.out.println(Result);
    }
}
