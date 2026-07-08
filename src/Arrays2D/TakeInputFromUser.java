package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputFromUser {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows");
        int n = sc.nextInt();
        System.out.println("Number of colums");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter values");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }




    }
}
