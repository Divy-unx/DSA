package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class GetCommonElement1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array 1");
        int n1 = sc.nextInt();
        System.out.println("Size of array 2");
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        System.out.println("Input elements of array 1");
        for(int i = 0; i < n1 ; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Input elements of array 2");
        for(int i = 0; i < n2 ; i++){
            nums2[i] = sc.nextInt();
        }

        HashSet<Integer> map = new HashSet<>();
        for(int num1 : nums1){
            map.add(num1);
        }
        for(int num2 : nums2){
            if(map.contains(num2)){
                System.out.println(num2);
                map.remove(num2);
            }
        }


    }
}
