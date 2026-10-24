package String;

import java.util.*;

public class ConcatenatedWords {
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, words);
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (isConcatenated(word, set)) {
                list.add(word);
            }
        }

        return list;
    }

    private static boolean isConcatenated(String word, HashSet<String> set) {

        int len = word.length();
        for (int i = 0; i < len; i++){
            String prefix = word.substring(0,i+1);
            String suffix = word.substring(i+1);

            if (set.contains(prefix) && set.contains(suffix) ||
                    set.contains(prefix) && isConcatenated(suffix,set)){
                return true;
            }
        }

        return false;

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        String[] strings = new String[num];
        for (int i = 0; i < num ; i++){
            strings[i] = sc.next();
        }

        System.out.println(findAllConcatenatedWordsInADict(strings));
    }
}
