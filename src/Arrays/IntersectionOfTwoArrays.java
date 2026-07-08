package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static int[] Intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int num1: nums1){
            set.add(num1);
        }
        for(int num2: nums2){
            ans.add(num2);
            set.remove(num2);
        }

        int[] result = new int[ans.size()];
        int i = 0;
        for(int key: ans){
            result[i] = key;
            i++;
        }
        return result;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nums1 Array size- ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter values");
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("nums2 Array size-");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter values");
        for(int i = 0; i < nums1.length; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Intersection(nums1, nums2)));

    }

}
