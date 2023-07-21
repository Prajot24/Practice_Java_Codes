package Numbers;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int num = ip.nextInt();
        if(num==1){
            System.out.println("NO");
            System.exit(0);
        }
        for (int i = 2; i <num; i++) {

            if(num % i==0){
                System.out.println("NO");
                System.exit(0);
            }

        }
        System.out.println("Yes");
    }

}
