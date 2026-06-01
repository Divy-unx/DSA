package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFreq {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length(); i++) {
            char chr = ch.charAt(i);
            if(map.containsKey(chr)) {
                int of = map.get(chr);
                int nf = of + 1;
                map.put(chr,nf);
            }else{
                map.put(chr,1);
            }
        }
        char mfc = ch.charAt(0);
        for(Character key: map.keySet()){
            if(map.get(key) > map.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc + " " + map.get(mfc));


    }
}
