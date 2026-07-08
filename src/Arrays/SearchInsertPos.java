package Arrays;

public class SearchInsertPos{
    public static void main(String[] args){
        int [] nums = {1,3,4,5,6};
        int target = 7;
        // int low = 0, high = nums.length-1;
        
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(nums[mid] == x){
        //         System.out.println(mid);
        //     }
        //     else if(nums[mid]<x){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;

        //     }
        // }
        // System.out.println(low);
        int i = 0;

        while(i<nums.length && nums[i] < target){
            i++;
        }
        System.out.println(i);
    }
}