package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// n = 19 = 1*1 + 9*9 = 82 = 8*8 + 2*2 = 68 = 6*6 + 8*8 = 100 = 1*1 + 0*0 + 0*0 = 1
public class HappyNumber {

    public static int SumOfSquareDigits(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static boolean HAppyNumber(int n){
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;

            }
            set.add(n);
            n = SumOfSquareDigits(n);
        }
        return true;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = HAppyNumber(n);
        System.out.println(ans);

    }



}
