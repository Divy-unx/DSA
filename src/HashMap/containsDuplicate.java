package HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Given an integer array nums,
// return true if any value appears at least twice
// in the array, and return false
// if every element is distinct.
public class containsDuplicate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        boolean ans = ContainsDuplicate(nums);
        System.out.println(ans);
    }
    public static boolean ContainsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0 ; i<nums.length; i++){
//            if(map.containsKey(nums[i])){
//                int of = map.get(nums[i]);
//                int nf = of + 1;
//                map.put(nums[i],nf);
//            }else{
//                map.put(nums[i], 1);
//            }
//        }
//        for(Integer val : map.keySet()){
//            if(map.get(val) >=2){
//                return true;
//            }
//        }
//        return false;

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;


    }
}
