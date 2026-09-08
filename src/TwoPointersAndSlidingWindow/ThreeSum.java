package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static long getHash(int x, int y, int z){
        long hash = x;
        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;

        return hash;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); //nlogn

        HashSet<Long> set = new HashSet<>();
        int target = 0;

        for(int i = 0; i < nums.length; i++){
            int newTarget = target - nums[i];

            int li = i + 1;
            int ri = nums.length - 1;
            while(li < ri){
                if(nums[li] + nums[ri] > newTarget){
                    ri--;
                }else if(nums[li] + nums[ri] < newTarget){
                    li++;
                }else{
                    long hash = getHash(nums[i], nums[li], nums[ri]);
                    if(!set.contains(hash)){
                        ans.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                        set.add(hash);
                    }

                    li++;
                    ri--;
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
        System.out.println(threeSum(nums));
    }
}
