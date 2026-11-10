package TwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums){
        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(nums1));
    }
}
