package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringAtleastKChar {
    public static int Substring(String s, int k){
        int left = 0;
        int maxlen= 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int right = 0; right < s.length(); right++){
            char key = s.charAt(right);
            if(map.containsKey(key) && map.get(key) >= k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(Substring(str,k));

    }
}
