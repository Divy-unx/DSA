package Recursion;

import java.util.Scanner;

public class ReverseAString {
    static String reverse(String s, int idx){
        if (idx >= s.length()){
            return "";
        }
        String res = reverse(s,idx + 1);
        return res + s.charAt(idx);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = sc.nextInt();

        System.out.println(reverse(s,idx));
    }
}
