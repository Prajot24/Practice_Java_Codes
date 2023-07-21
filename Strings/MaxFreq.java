package Strings;

public class MaxFreq {
    public static void main(String[] args) {
        String str = "prasidnsjaaaaaassssssssssssssssssss";
        int count[] = new int[256];
        char ans ='z';
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            if(count[str.charAt(i)]>max){
                max=count[str.charAt(i)];
                ans=str.charAt(i);
            }


        }
        System.out.println(ans);
    }
}
