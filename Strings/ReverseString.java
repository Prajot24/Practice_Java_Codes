package Strings;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        String rev = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+""+str.charAt(i);
        }
        rev = rev.trim();
        System.out.print(rev);

    }
}
