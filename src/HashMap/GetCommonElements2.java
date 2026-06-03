package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElements2 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array 1");
        int n1 = sc.nextInt();
        System.out.println("Size of array 2");
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        System.out.println("Input elements of array 1");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Input elements of array 2");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num1 : nums1) {
            if (map.containsKey(num1)) {
                int of = map.get(num1);
                int nf = of + 1;
                map.put(num1, nf);
            } else {
                map.put(num1, 1);
            }
        }

        for(int num2 : nums2){
            if(map.containsKey(num2)){
                if(map.get(num2) > 0){
                    System.out.println(num2);
                    int nf = map.get(num2) - 1;
                    map.put(num2,nf);
                }
            }

        }
    }
}
