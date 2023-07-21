package StriverDSASheet;

public class PascalsTriangle {
    public static void main(String[] args) {
        int num = 6;
        int ans =1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ans+" ");
                    ans = ans*(i-j)/(j+1);
                    //ans = ans/j;
                //System.out.println("Answer :"+ans);
            }
            ans=1;
            System.out.println();
        }
    }
}
