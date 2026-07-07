package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNum {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            if (set.contains(num)) {
                System.out.println(num);
            } else {
                set.add(num);
            }
        }
    }
}
