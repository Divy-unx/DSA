package SlidingWindow;

import java.util.Scanner;

public class MaximumPointsYouCanObtainsFromCards {
    static int maximum(int[] nums, int k){
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < k; i++){
            lsum += nums[i];
        }
        int maxSum = lsum;
        int rightIndex = nums.length - 1;
        for (int i = k - 1; i >= 0; i--){
            //shrink
            lsum -= nums[i];
            rsum += nums[rightIndex];
            maxSum = Math.max(maxSum,lsum + rsum);
        }
        
        return maxSum;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maximum(nums, k));
    }
}
