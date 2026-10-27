package Recursion;

import java.util.Scanner;

public class ReverseStringPrefix {
    public static String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while(i < k / 2){
            char temp = sb.charAt(i);
            sb.setCharAt(i,s.charAt(k-1-i));
            sb.setCharAt(k-1-i,temp);
            i++;
        }

        return sb.toString();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = sc.nextInt();

        System.out.println(reversePrefix(s,idx));
    }

}
