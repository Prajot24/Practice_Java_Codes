package StriverDSASheet;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int newarr[][] = new int[arr.length][arr[0].length];

        for (int i = 0, a= 3; i < arr.length; i++,a--) {

            for (int j = 0; j < arr[0].length; j++) {
                newarr[j][a] = arr[i][j];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
