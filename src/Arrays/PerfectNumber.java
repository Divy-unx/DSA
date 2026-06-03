package Arrays;
//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
//
//Given an integer n, return true if n is a perfect number, otherwise return false.
//
//
//
//Example 1:
//
//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, and 14 are all divisors of 28.
//Example 2:
//
//Input: num = 7
//Output: false

import java.util.Scanner;

public class PerfectNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int sum = 0;
//        int i = 1;
//        while(i > 0 && i < num){
//            if (num % i == 0) {
//                sum = sum + i;
//            }
//            i++;
//        }
//        System.out.println(sum == num);
        boolean ans = PerfectNum(num);
        System.out.println(ans);
    }
    public static boolean PerfectNum(int num){
        if (num <= 1){
            return false;
        }
        int sum = 1;

        for(int i = 2; i * i < num; i++){
            if(num % i == 0){
                sum+= i;
                if(i != num/i){
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

}
