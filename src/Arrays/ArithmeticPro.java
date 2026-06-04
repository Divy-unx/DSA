package Arrays;
import java.util.*;

public class ArithmeticPro {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i = 0; i < n; i++){
            int max = Math.max(arr[i], arr[i+1]);
            int min = Math.min(arr[i], arr[i+1]);
            System.out.println("Max = " + max + " Min = " + min);
        }
        scanner.close();
    }
}
