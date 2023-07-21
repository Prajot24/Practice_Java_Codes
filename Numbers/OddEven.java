package Numbers;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if(num%2==0){
            System.out.println("Number Is Even");
        }else{
            System.out.println("Number Is Odd");
        }
    }
}
