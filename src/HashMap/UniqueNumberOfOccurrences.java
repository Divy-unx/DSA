package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumberOfOccurrences {
    public static boolean unique(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> unique = new HashSet<>();
        for(int val: map.values()){
           if (unique.contains(val)){
               return false;
           }else{
               unique.add(val);
           }
        }
        return true;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println(unique(nums));
    }
}
