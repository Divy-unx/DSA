package Maths;

import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(myPow(num , pow));
    }
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        double xnm1 = myPow(x , n - 1);
        return x * xnm1;
    }
}
