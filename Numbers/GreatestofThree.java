package Numbers;

import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Three Number :");
        int a=ip.nextInt();
        int b=ip.nextInt();
        int c= ip.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        }else if(b>a && b>c){
            System.out.println(b+" is greater");
        }else {
            System.out.println(c+" is greater");
        }

    }
}
