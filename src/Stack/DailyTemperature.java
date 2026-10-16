package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyTemperature {
    public static List<Integer> temperature(int[] nums){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] > nums[i]) {
                    list.add(j - i);
                    break;
                }
            }
            if (list.size() == i){
                list.add(0);
            }
        }
        return list;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int [] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println(temperature(nums1));
    }
}
