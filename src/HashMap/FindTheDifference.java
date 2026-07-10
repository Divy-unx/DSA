package HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class FindTheDifference {
    public static char Difference(String s,  String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            Integer freq = map.get(ch);
            if(freq != null && freq > 0){
                map.put(ch, freq - 1);
            }else{
                return ch;
            }
        }
        return ' ';
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(Difference(str1, str2));

    }
}
