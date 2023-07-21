package Strings;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="ABCAB";
        int left = 0;
        int right = str.length()-1;
        System.out.println(right);
        int flag=-1;
        //char l = str.charAt(left);

        while(left<right){
            char l = str.charAt(left);
            char R = str.charAt(right);
            if(l==R){
                flag=1;
                break;

            }else{
                left++;
                right--;

            }
        }
        if(flag==0){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }

//        String str = "ABCBA";
//        String Rev ="";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            Rev=Rev+""+str.charAt(i);
//        }
//        System.out.println(Rev);
//
//        if(Rev.equals(str)){
//            System.out.println("Palindrom");
//        }

    }
}
