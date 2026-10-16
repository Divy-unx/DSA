package Stack;

import java.util.Scanner;

public class rough {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            System.out.println(ch);
        }
    }
}
