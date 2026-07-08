package Arrays;

import java.util.Arrays;

public class BuildArrayFromPer{
    public static void main(String[] args) {
        int [] nums = {0,2,3,5,4,1};
        // int ans[] = new int[nums.length];
        // // buildArray(nums);  

        // for(int i = 0; i < nums.length; i++){
        //     int temp = nums[i];
        //     ans[i] = nums[temp]; 

        // } 
        // System.out.println(Arrays.toString(ans)); 
        
            
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] + (nums[nums[i]] % n)*n;
        }
        for(int i = 0; i < n; i++){
            nums[i] = nums[i]/n;
        }

        System.out.println(Arrays.toString(nums));
    }


}
