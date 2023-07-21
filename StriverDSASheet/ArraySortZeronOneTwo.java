package StriverDSASheet;

public class ArraySortZeronOneTwo {
    public static void main(String[] args) {
        int a[] = {1,1,0,0,2,0,1,0};
        int c0 = 0;
        int c1= 0;
        int c2 =0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                c0++;
            }else if(a[i]==1){
                c1++;
            }else{
                c2++;
            }

        }
        System.out.println(c0+" "+c1+" "+c2);

        for (int i = 0; i < c0; i++) {
            a[i]=0;
        }

        for (int i = c0; i < c0+c1; i++) {
            a[i]=1;
        }



        for (int i = c0+c1; i < a.length; i++) {
            a[i]=2;
        }

        for (int x: a) {
            System.out.print(x+" ");
        }
    }
}
