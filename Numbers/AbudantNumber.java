package Numbers;

import java.sql.SQLOutput;

public class AbudantNumber {
    public static void main(String[] args) {
        int num = 21;
        int sum =0;
        for (int i = 1; i < 18; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.print("Number Abudant");
        }else{
            System.out.println("Number Is not Abudant");
        }
    }
}
