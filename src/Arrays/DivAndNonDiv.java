package Arrays;

import java.util.Scanner;

public class DivAndNonDiv {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = differenceOfSums(n,  m);
        System.out.println(res);
    }
    public static int differenceOfSums(int n, int m) {
//        int num1 = 0;
//        int num2 = 0;
//        for(int i = 1; i <= n; i++){
//            if(i % m != 0){
//                num1 += i;
//            }else{
//                num2+= i;
//            }
//        }
//        return num1 - num2;
        int x = n / m;
        int num2 = m * x * (x + 1)/2;
        int num1 = n * (n + 1)/2 - num2;
        return num1 - num2;


    }
}
