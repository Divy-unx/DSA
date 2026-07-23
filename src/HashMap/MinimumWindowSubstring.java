package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String MinimumSubstring(String s1, String s2){
        String ans = "";

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        int mct = 0; //match count
        int dct = s2.length();// Desired match count
        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1;
        int j = -1;

        while(true){
            boolean f1 = false;
            boolean f2 = false;

            //acquired
            while(i < s1.length() - 1 && mct < dct){
                i++;
                char ch = s1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch,0)){
                    mct++;
                }
                f1 = true;
            }

            // collect ans and release
            while(j < i && mct == dct){
                String pans = s1.substring(j+1, i+1);
                if (ans.isEmpty() || pans.length() < ans.length()){
                    ans = pans;
                }
                j++;
                char ch = s1.charAt(j);
                if (map1.getOrDefault(ch,0) == 1){
                    map1.remove(ch);
                }else{
                    map1.put(ch, map1.getOrDefault(ch,0) - 1);
                }

                if (map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0)){
                    mct--;
                }
                f2 = true;
            }

            if (!f1 && !f2){
                break;
            }
        }
        return ans;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(MinimumSubstring(s1, s2));
    }
}
