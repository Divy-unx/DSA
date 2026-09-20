package Recursion;

import java.util.Scanner;

public class printIncreasing {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printIncreasing(n);
    }
    public static void printIncreasing(int n){
        if (n == 0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
