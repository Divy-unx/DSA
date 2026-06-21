package Arrays2D;

import java.util.Scanner;

public class PrimeDiagonal {

    public static int Isprime(int x){
        if(x <= 1){
            return 0;
        }
        for(int i = 2; i*i <= x; i++){
            if(x % i == 0){
                return 0;
            }
        }
        return x;

    }
    public static int diagonalPrime(int[][] nums) {
        int max = 0;

        int prime = 0;

        for(int i = 0; i < nums.length; i++) {
            int prime2 = 0;
            prime = Isprime(nums[i][i]);
            if (i != nums.length - 1 - i) {
                prime2 = Isprime(nums[i][nums.length - 1 - i]);
            }
            max = Math.max(max, prime);
            max = Math.max(max, prime2);
        }
        return max;

    }
    static void main() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = diagonalPrime(arr);
        System.out.println(max);

    }
}
