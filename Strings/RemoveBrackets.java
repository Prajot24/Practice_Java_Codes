package Strings;

public class RemoveBrackets {
    public static void main(String[] args) {
        String str = "A+(wer3(+C+D";
        String ans ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='(' && str.charAt(i)!=')'){
                ans=ans+""+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
