package Stack;

import java.util.Scanner;

public class TrappingRainWaterOptimised {
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left <= right){
            if (height[left] < height[right]){
                leftMax = Math.max(leftMax , height[left]);
                water += leftMax - height[left];
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int[] height = new int[num];
        for (int i = 0; i < num ; i++){
            height[i] = sc.nextInt();
        }

        System.out.println(trap(height));
    }
}
