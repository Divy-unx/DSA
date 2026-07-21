package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubstringContainingAllThreeCharacters {
    public static int NumberOfSubstring(String s){
        int n = s.length();
        int left  = 0;
        int[] freq = new int[3];
        int count = 0;

        for(int right = 0; right < n; right++){
           freq[s.charAt(right) - 'a']++;

           while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
               count = count + n - right;

               freq[s.charAt(left) - 'a']--;
               left++;
           }
        }

        return count;
    }
    public static int Substring(String s){
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++){
                map.put(s.charAt(j), 1);
                if (map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
                    count++;
                }
            }
        }
        return count;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Substring(s));
        System.out.println(NumberOfSubstring(s));
    }
}
