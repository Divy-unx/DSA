package Recursion;

import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        int fnm1 = fact(n-1);
        return n * fnm1;
    }
}