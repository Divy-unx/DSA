package Stack;

import java.util.*;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && i < 0) {
                int sum = stack.peek() + i;

                if (sum > 0) {
                    destroyed = true;
                    break;
                }
                else if (sum < 0) {
                    stack.pop();
                }
                else {
                    stack.pop();
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(i);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(asteroidCollision(nums1)));
    }
}
