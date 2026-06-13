package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralTraversal {
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

        int minR = 0;
        int maxR = arr.length - 1;

        int minC = 0;
        int maxC = arr[0].length-1;

        int count = 0;
        int total = n * m;

        while(count < total){
            // left wall
            for(int i = minR , j = minC; i <= maxR && count < total ; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minC++;

            // bottom wall
            for(int j = minC, i = maxR  ; j <= maxC && count < total; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxR--;

            //Right Wall
            for(int j = maxC, i = maxR  ; i >= minR && count < total; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxC--;


            for(int j = maxC, i = minR  ; j >= minC && count < total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minR++;

        }


    }
}
