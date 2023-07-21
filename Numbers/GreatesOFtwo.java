package Numbers;

import java.util.Scanner;

public class GreatesOFtwo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Two number: ");
        int num = ip.nextInt();
        int num2= ip.nextInt();
        if(num>num2){
            System.out.println(num+" greater than "+num2);
        }else{
            System.out.println(num2+" greater than "+num);
        }
    }
}
