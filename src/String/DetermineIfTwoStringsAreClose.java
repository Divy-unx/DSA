package String;

import java.util.Arrays;
import java.util.Scanner;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        if (m != n){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < m; i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            int idx1 = ch1 - 'a';
            int idx2 = ch2 - 'a';

            freq1[idx1]++;
            freq2[idx2]++;
        }

        for(int i = 0; i < m; i++){
           if (freq1[i] != 0 && freq2[i] != 0) continue;
           if (freq1[i] == 0 && freq2[i] == 0) continue;

           return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1,freq2);


    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(closeStrings(word1,word2));
    }
}
