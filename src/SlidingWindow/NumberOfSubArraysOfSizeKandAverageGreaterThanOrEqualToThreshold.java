package SlidingWindow;

import java.util.Scanner;

public class NumberOfSubArraysOfSizeKandAverageGreaterThanOrEqualToThreshold {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        while(j < arr.length){
            sum += arr[j];

            if(j - i + 1 == k){
                if(sum >= k * threshold){
                    count++;
                }

                sum -= arr[i];
                i++;
            }
            j++;
        }

        return count;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int k = sc.nextInt();
        int threshold = sc.nextInt();
        int[] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println((numOfSubarrays(nums1, k,threshold)));
    }
}
