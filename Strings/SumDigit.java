package Strings;

public class SumDigit {
    public static void main(String[] args) {
        String str = "12ptan4";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                String temp = "0";
                temp+=ch;
                int d = Integer.parseInt(temp);
                sum+=d;
                temp="0";
            }
        }
        System.out.println(sum);
    }
}
