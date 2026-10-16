package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        int last = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }else if (nums[mid] > target){
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }else if (nums[mid] > target){
                high = mid - 1;
            }
        }
        return new int[] {first,last};
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int target = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println((Arrays.toString(searchRange(nums1, target))));
    }
}
