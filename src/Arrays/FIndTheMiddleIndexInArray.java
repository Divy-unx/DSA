package Arrays;

import java.util.Scanner;

public class FIndTheMiddleIndexInArray {
    public static int MiddleIndex(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int leftSum = 0;
            int rightSum = 0;

            int left = i-1;
            while(left >= 0){
                leftSum += nums[left];
                left--;
            }

            int right = i + 1;
            while(right < nums.length){
                rightSum += nums[right];
                right++;
            }

            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(MiddleIndex(nums));
    }
}
