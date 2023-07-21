package Numbers;

public class PrimeNumRange {
    public static void main(String[] args) {
    int count=0;
        for (int num = 1; num < 30; num++) {
            for (int i = 2; i <= num; i++) {
                if(num==1){
                    System.out.print(num+" ");
                    break;
                }else
                if(num==i){
                    continue;
                }
                else if(num%i==0){
                    count=1;
                    break;
                }

            }
            if(count==0){
                System.out.print(num+" ");
            }
            count=0;
         }


    }
}




