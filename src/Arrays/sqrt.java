package Arrays;

import java.util.Scanner;

public class sqrt {
    static void main() {
//        int x = 1;
//        int sqrt = 0;
//        for(int i = 1; i<=x; i++){
//            if((long)i*i> x){
//                break;
//            }
//            sqrt = i;
//        }
//        System.out.println(sqrt);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = 0;
        int high = n;
        int sqrt = 0;
        while(low<high) {
            int mid = low + (high - low) / 2;
            if ((mid * mid) <= n) {
                sqrt = mid; 
            }
            high--;
        }
        System.out.println(sqrt);

    }
}