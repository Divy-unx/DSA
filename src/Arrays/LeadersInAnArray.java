package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeadersInAnArray {
    public static int[] Leaders(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i >=0 ;i--){
            if (nums[i] > max){
                max = nums[i];
                list.add(nums[i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = list.get(list.size() - 1- i);
        }
        return res;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }

        int[] res = Leaders(nums);
        System.out.println(Arrays.toString(res));
    }
}
