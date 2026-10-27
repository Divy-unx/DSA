package Stack;

import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;

        for (int i = 1; i < n-1; i++){
            int max1 = height[i - 1];
            int x = i;
            int y = i;

            while(x - 1 >= 0){
                if (height[x - 1] > max1){
                    max1 = height[x-1];
                }
                x--;
            }
            int max2 = height[i+1];

            while(y + 1 <= n - 1){
                if (height[y + 1] > max2){
                    max2 = height[y+1];
                }
                y++;
            }
            ans += Math.max(0,Math.min(max1,max2) - height[i]);

        }
        return ans;
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
