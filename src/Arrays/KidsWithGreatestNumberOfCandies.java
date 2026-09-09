package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = candies[0];
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }

        return ans;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int extraCandies = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(kidsWithCandies(nums, extraCandies));
    }
}
