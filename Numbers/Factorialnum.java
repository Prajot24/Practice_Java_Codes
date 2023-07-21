package Numbers;

import java.util.Scanner;

public class Factorialnum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
