package Arrays2D;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class DiagonalTraversal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int gap = 0; gap < arr.length; gap++){
            for(int i = 0, j = gap; j < arr.length; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
