package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroesBrute {
    public static int[][] setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }


        return matrix;
    }

    public static void markRow(int[][] matrix,int i){
        for (int j = 0; j < matrix[0].length; j++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    public static void markCol(int[][] matrix,int j){
        for (int i = 0; i < matrix[0].length; i++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] result = setZeroes(matrix);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

