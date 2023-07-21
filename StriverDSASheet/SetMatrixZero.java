package StriverDSASheet;

import java.util.HashMap;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5},{4,6,0}};
        int row = matrix.length;
        int col = matrix[0].length;

        HashMap<Integer,Integer> rowmap = new HashMap<>();
        HashMap<Integer,Integer> colmap = new HashMap<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==0){
                    rowmap.put(i,0);
                    colmap.put(j,0);
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rowmap.containsKey(i) || colmap.containsKey(j)){
                    matrix[i][j]=0;
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }

    }
}
