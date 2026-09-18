package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDecreasing(n);
    }
    public static void printDecreasing(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}