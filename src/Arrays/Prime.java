package Arrays;

import java.util.Scanner;

public class Prime {
    public static int prime(int x){
        for(int i = 2; i*i < x; i++){
            if(x % i == 0){
                return -1;
            }
        }
        return x;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = prime(n);
        System.out.println(ans);

    }
}
