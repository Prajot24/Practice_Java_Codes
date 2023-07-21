package Strings;

public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        String str = "HEllo Every       One How ";
                str=str.replaceAll("( )+"," ");
                str = str.trim();
        System.out.println(str);
    }
}
