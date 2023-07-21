package StriverDSASheet;

public class DutchNSortArray {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2 ,1, 0};
        int low = 0;
//        System.out.println(a[low++]);
        int high = a.length-1;
        int mid =0;
        //int mid = a[0];
            while( mid<=high) {
                if (a[mid] == 0) {
                    int temp = a[mid];
                    a[mid] = a[low];
                    a[low] = temp;
                    low++;
                    mid++;
                } else if (a[mid] == 1) {
                    mid++;
                } else {
                    int temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                }

            }


        for (int x:a) {
            System.out.println(x);
        }

    }
}
