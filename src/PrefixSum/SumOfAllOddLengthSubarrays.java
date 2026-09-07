package PrefixSum;

import java.util.Scanner;

public class SumOfAllOddLengthSubarrays {
    public static int OddLengthSubarray(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++){
                sum += nums[i];
                if (((j-i+1) % 2 == 1)){
                    ans += sum;
                }
            }
        }
        return ans;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(OddLengthSubarray(nums));
    }
}
