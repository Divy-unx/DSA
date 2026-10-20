package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIndWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char x = sc.next().charAt(0);
        String[] nums1 = new String[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextLine();
        }
        System.out.println(findWordsContaining(nums1,x));
    }
}
