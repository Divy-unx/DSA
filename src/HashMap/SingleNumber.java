package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
//            if(map.containsKey(num)){
//                int of = map.get(num);
//                int nf = of + 1;
//                map.put(num,nf);
//            }else{
//                map.put(num, 1);
//            }
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
