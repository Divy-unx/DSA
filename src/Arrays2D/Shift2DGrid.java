package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Shift2DGrid {
    public static void reverse(int[][] grid, int low, int high){
        int col = grid[0].length;
        while(low < high){
            int temp = grid[low/col][low % col];
            grid[low/col][low % col] = grid[high/col][high % col];
            grid[high/col][high % col] = temp;
            low++;
            high--;
        }
    }
    public static int[][] grid2D(int[][] grid, int k){
        int n = grid.length * grid[0].length;
        k = k % n;
        if (k < 0){
            k = k + n;
        }
        reverse(grid,0, n-k-1);
        reverse(grid,n-k, n-1);
        reverse(grid,0, n-1);

        return grid;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows");
        int m = sc.nextInt();
        System.out.println("Number of colums");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter values");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of shifts: ");
        int k = sc.nextInt();

        int[][] res = grid2D(arr,k);
        for (int[] row : res){
            System.out.println(Arrays.toString(row));
        }
    }
}
