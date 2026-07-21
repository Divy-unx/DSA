package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubstringContainingAllThreeCharacters {
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
    }
}
