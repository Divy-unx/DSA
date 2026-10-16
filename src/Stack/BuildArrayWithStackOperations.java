package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuildArrayWithStackOperations {
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        int i = 0;
        int Switch = 1;

        while(i < target.length && Switch <= n){
            if(Switch == target[i]){
                list.add("Push");
                i++;

            }else{
                list.add("Push");
                list.add("Pop");
            }
            Switch++;
        }

        return list;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println(buildArray(nums1,n));
    }
}
