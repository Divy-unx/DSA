package Arrays2D;

import java.util.Scanner;

public class WaveTraversal {
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
       for(int j = 0; j < arr[0].length; j++){
           if(j % 2 == 0){
               for(int i = 0 ; i < arr.length; i++){
                   System.out.println(arr[i][j]);
               }
           }
           else{
               for(int i = arr.length - 1; i >= 0; i--){
                   System.out.println(arr[i][j]);
               }
           }
       }
    }
}
