package Recursion;
import java.util.*;
public class print1ToN {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printIncrease(n);
    }

    static void printIncrease(int n){
        if (n == 0){
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
}
