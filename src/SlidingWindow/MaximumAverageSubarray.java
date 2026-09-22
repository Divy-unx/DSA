package SlidingWindow;

import java.util.Scanner;

public class MaximumAverageSubarray {
    public static double average(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
           sum += nums[i];
        }

        int left = 0;
        int right = k - 1;
        int max = sum;

        while(right < nums.length - 1){
            sum -= nums[left];

            left++;
            right++;

            sum += nums[right];
            max = Math.max(max, sum);
        }

        return (double)max / k;    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(average(nums, k));
    }
}
