package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayBySign {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }

        int posIndex = 0;
        int negIndex = 1;
        for(int num: nums){
            if(num < 0){
                ans[negIndex] = num;
                negIndex = negIndex + 2;
            }else{
                ans[posIndex] = num;
                posIndex = posIndex + 2;

            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
