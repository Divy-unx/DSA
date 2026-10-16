package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MaximumSumofDistinctSubarraysWithLengthK {

    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        long sum = 0;
        long maxSum = 0;

        while(j < nums.length){

            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            set.add(nums[j]);
            sum += nums[j];

            if(j - i + 1 == k){
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int k = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println((maximumSubarraySum(nums1, k)));
    }
}
