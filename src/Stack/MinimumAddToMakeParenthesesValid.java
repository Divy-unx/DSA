package Stack;

import java.util.Scanner;

public class MinimumAddToMakeParenthesesValid {
    public static  int minAddToMakeValid(String s) {
        int size = 0;
        int open = 0;

        for(Character ch : s.toCharArray()){
            if(ch == '('){
                size++;
            }else if(ch == ')'){
                if(size > 0){
                    size--;
                }else{
                    open++;
                }
            }
        }
        return open + size;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        System.out.println(minAddToMakeValid(num));
    }
}
