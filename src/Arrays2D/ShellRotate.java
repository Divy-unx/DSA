package Arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class ShellRotate {
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

        int shell = sc.nextInt();
        int r = sc.nextInt();
        shellRotate(arr, shell,r);
        display(arr);
    }
    public static void shellRotate(int[][] arr, int shell, int r){
        int [] OneD = fillOneDFromShell(arr, shell);
        rotate(OneD, r);
        fillShellFromOneD(OneD, arr, shell);
    }

    public static void rotate(int[] oned, int k){
        k = k % oned.length;
        if(k<0){
            k = k + oned.length;
        }

        reverse(oned, 0, oned.length-k-1);
        reverse(oned, oned.length - k, oned.length-1);
        reverse(oned, 0, oned.length-1);
    }

    public static void reverse(int[] oned, int low, int high){
        while(low < high){
            int temp = oned[low];
            oned[low] = oned[high];
            oned[high] = temp;
            low++;
            high--;
        }

    }

    public static int[] fillOneDFromShell(int [][] arr, int s){
        int minR = s-1;
        int minC = s - 1;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;

        int sz = 2 * (  maxR - minR + maxC - minC);
        int[] OneD = new int[sz];

        int indx = 0;

        //lw

        for(int i = minR, j = minC; i <= maxR; i++){
            OneD[indx] = arr[i][j];
            indx ++;
        }
        // bw
        for(int i = maxR, j = minC + 1; j <= maxC; j++){
            OneD[indx] = arr[i][j];
            indx ++;
        }
        //rw
        for(int i = maxR - 1, j = maxC; i >= minR; i--){
            OneD[indx] = arr[i][j];
            indx ++;
        }
        //tw

        for(int i = minR, j = maxC - 1; j >= minC + 1 ; j--){
            OneD[indx] = arr[i][j];
            indx ++;
        }
        return OneD;
    }
    public static void fillShellFromOneD(int [] oned, int[][] arr, int s){
        int minR = s-1;
        int minC = s - 1;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;

        int indx = 0;

        //lw

        for(int i = minR, j = minC; i <= maxR; i++){
            arr[i][j] = oned[indx];
            indx ++;
        }
        // bw
        for(int i = maxR, j = minC + 1; j <= maxC; j++){
            arr[i][j] = oned[indx];
            indx ++;
        }
        //rw
        for(int i = maxR - 1, j = maxC; i >= minR; i--){
            arr[i][j] = oned[indx];
            indx ++;
        }
        //tw

        for(int i = minR, j = maxC - 1; j >= minC + 1 ; j--){
            arr[i][j] = oned[indx];
            indx ++;
        }
    }



    public static void display(int[][] arr){
        for(int []row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
