package Arrays2D;

import java.util.Scanner;

public class SearchInA2DArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows");
        int n = sc.nextInt();
        System.out.println("Number of colums");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter values");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Target: ");
        int target = sc.nextInt();


        int i = 0;
        int j = matrix[0].length - 1;

        while( i < matrix.length && j >= 0){
            if(target == matrix[i][j] ) {
                System.out.println(true);
                return;
            }

            else if(target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }

        }
        System.out.println(false);
    }
}
