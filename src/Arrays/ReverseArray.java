package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {6,18,2,1,19,2};
        // int n = arr.length;
        // for (int i = 0; i < n/2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
            
        // }
        // System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    
    
    }
    
}
