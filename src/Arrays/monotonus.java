package Arrays;

public class monotonus{
    public static void main(String[] args){
        int [] nums = {1,2,2,3,4,5};
        boolean ans = Monotonus(nums);
        System.out.println(ans);
        
        

    }

    public static boolean Monotonus(int[] nums){

        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 1; i > nums.length; i++){
            if(nums[i] > nums[i-1]){
                increasing = false;
            }

            if(nums[i] < nums[i-1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

}