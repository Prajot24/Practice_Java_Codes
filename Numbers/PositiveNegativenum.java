package Numbers;

import java.util.Scanner;

public class PositiveNegativenum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        if(num>=0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
    }
}
