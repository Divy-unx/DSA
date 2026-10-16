package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidateStackPreferences {
    public static boolean validate(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int j = 0;

        while (i < pushed.length) {

            stack.push(pushed[i]);
            i++;

            while (!stack.isEmpty() &&
                    j < popped.length &&
                    stack.peek() == popped[j]) {

                stack.pop();
                j++;
            }
        }

        return j == popped.length;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[num2];

        for(int i = 0; i < nums2.length; i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(validate(nums1, nums2));
    }
}
