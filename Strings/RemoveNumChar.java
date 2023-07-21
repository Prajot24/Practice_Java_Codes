package Strings;

public class RemoveNumChar {
    public static void main(String[] args) {
        String str = "prajo34 mali18$";
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122){
                ans=ans+""+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
