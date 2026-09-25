package Recursion;

import java.util.Scanner;

public class printDecreaseIncrease {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDecreasingIncreasing(n);
    }
    public static void printDecreasingIncreasing(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}
