package StriverDSASheet;

public class  NextPermutation {
    public static void main(String[] args) {
        int a[] = {2,1,5,4,3,0,0};
        int b[] = new int[a.length];
        int n = a.length;
        int ind = -1;
        for (int i = n-2; i >=0 ; i--) {
            if(a[i]<a[i+1]){
                ind = i;
                break;
            }
        }


//        System.out.println();
//        System.out.println(ind);

        for (int i = n-1; i >= 0; i--) {
            if(a[ind]<a[i]){
                int temp = a[ind];
                    a[ind] = a[i];
                    a[i]=temp;
                    break;

            }
        }

        for (int i = 0; i <= ind; i++) {
            b[i]=a[i];
        }
        int j;
        int i;
        for (i=n-1,j=ind+1;i>ind;i--,j++) {
           b[j]=a[i];
        }
        for (int x:b) {
            System.out.print(x+" ");
        }


    }

}
