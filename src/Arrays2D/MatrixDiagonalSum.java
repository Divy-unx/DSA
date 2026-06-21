package Arrays2D;

import java.util.Scanner;

public class MatrixDiagonalSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i][i];
            if(i != arr.length - 1 - i){
                sum = sum + arr[i][n-1-i];

            }
        }
        System.out.println(sum);
    }
}
