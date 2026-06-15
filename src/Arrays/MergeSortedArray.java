package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        int[] nums1 = new int[m + n];
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        Merge(nums1, nums2, m, n);
    }
    public static void Merge(int [] nums1, int[] nums2, int m, int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while( i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
                k--;
            }

        }
        while(i >= 0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        System.out.println(Arrays.toString(nums1));

    }
}
