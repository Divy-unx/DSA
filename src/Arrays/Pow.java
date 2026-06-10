package Arrays;

import java.util.Scanner;

public class Pow {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int pow = scanner.nextInt();
        int n = 2;
        int ans = 1;
        if(pow >= 0){
            for(int i = 1; i<=pow; i++){
                ans = ans * 2;
            }
        }else{
            for(int i = pow; i > 0; i++){
                ans = ans /2;
            }
        }

        System.out.println(ans);

    }
}
