package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexicographicalNumbers {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int startNum = 1; startNum <= 9; startNum++) {
            Solve(startNum, n, result);
        }
        return result;
    }

    public static void Solve(int currNum, int n, List<Integer> result) {
        if (currNum > n) return;

        result.add(currNum);

        for (int append = 0; append <= 9; append++) {
            int newNum = currNum * 10 + append;

            if (newNum > n) return;

            Solve(newNum, n, result);
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(lexicalOrder(num1));
    }
}
