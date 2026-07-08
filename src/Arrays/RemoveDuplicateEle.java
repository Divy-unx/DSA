package Arrays;

public class RemoveDuplicateEle{
    public static void main(String[] args){

        int arr[] = {1,1,1,2,2,3,4,4};
        int k = removeduplicate(arr);
        System.out.println(k);
     

    }
    public static int removeduplicate(int [] nums){
        int n = nums.length;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    for(int k = j; k < n-1; k++){
                        nums[k] = nums[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        
        return n;

    }

    class OptimalSol {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

    
}