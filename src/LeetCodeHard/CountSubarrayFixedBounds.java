package LeetCodeHard;

import java.util.Scanner;

public class CountSubarrayFixedBounds {

    public static int count(int[] nums, int mink, int maxk){
        int minPos = -1;
        int maxPos = -1;
        int culpritidx = -1;
        long ans = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] < mink || nums[i] > maxk){
                culpritidx = i;
            }

            if(nums[i] == mink){
                minPos = i;
            }
            if(nums[i] == maxk){
                maxPos = i;
            }
            long smallest = Math.min(minPos, maxPos);
            long temp = (smallest - culpritidx);
            ans += (temp <= 0) ? 0 : temp;

        }
        return (int) ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int mink = sc.nextInt();
        int maxk = sc.nextInt();


        System.out.println(count(nums, mink, maxk));
    }

}