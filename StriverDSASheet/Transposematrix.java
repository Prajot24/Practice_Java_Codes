package StriverDSASheet;

public class Transposematrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                       {13,14,15,16}};
        int j = 0;
        //int tranarr[][] = new int[arr.length][arr[0].length];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                int temp = arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {

//            System.out.println(k);
                for (j = 0; j < arr[0].length; j++) {
                    int k = arr.length-j-1;
                    if(k<j){
                        break;
                    }else{
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }

                }

        }
        
        for (int i = 0; i < arr.length; i++) {
            for ( j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
