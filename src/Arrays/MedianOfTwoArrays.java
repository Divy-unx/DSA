package Arrays;

import java.util.Scanner;

public class MedianOfTwoArrays {
    public static double median(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
            }else{
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }

        int len = ans.length;
        if (len % 2 == 0){
            int n1 = len / 2;
            int n2 = (len / 2) - 1;
            return ((double) (ans[n1] + ans[n2]) / 2);
        }else{
            return ans[len / 2];
        }
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

        System.out.println(median(nums1, nums2));
    }
}
