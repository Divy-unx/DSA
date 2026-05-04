package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static int[] TwoSums(int[] arr, int target){
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length-1;

    while(left < right){
        int sum = arr[left] + arr[right]; 
        if(sum == target){
            return new int[] {arr[left], arr[right]};
        }
        if(sum<target){
            left++;
        }else{
            right--;
        }
    }
    return new int[] {-1,-1};
}

  
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        System.out.println(Arrays.toString(TwoSums(nums, target)));
        
    }


    
}
