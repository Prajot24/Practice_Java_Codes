package Numbers;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int rev = 0;
        while (num>0){
            rev=(rev*10)+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
