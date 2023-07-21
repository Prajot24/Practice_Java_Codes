package Strings;

import java.util.Scanner;



public class FirstnLastCap {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();

        str=str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0))) ;
        str = str.replace(str.charAt(str.length()-1), Character.toUpperCase(str.charAt(str.length()-1)));

        System.out.println(str);
    }

}
