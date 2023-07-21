package Strings;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
//        String str = ip.nextLine();
//        String arr[]=str.split("");
////        for (String x:arr
////             ) {
////            System.out.println(x);
////
////        }
//        String Rev = "";
//        for (int i = arr.length-1; i >=0 ; i--) {
//            Rev = Rev+""+arr[i];
//        }
//        System.out.print(Rev);
        String A = ip.nextLine();
        A = A.replaceAll("( )+", " ");
        System.out.println("Replace : "+A);
        A = A.trim();
        System.out.println("Trim: "+A);
        String[] str = A.split(" ");
        String result ="";
        for(int i= str.length-1;i>=0;i--)
            result = result +" " +str[i];
        System.out.println("Without trim"+result);
        System.out.println("When Trim Result: "+result.trim());
    }
}
