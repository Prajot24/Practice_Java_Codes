package Numbers;

public class LeapShort {
    public static void main(String[] args) {
        int year = 1900;
        if((year%4==0) && (year%100!=0)||(year%400==0))
        {
            System.out.println("Year Is leap");
        }else{
            System.out.println("Year Is not leap");
        }
    }
}
