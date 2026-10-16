package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumAddToMakeParenthesesValid2 {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        System.out.println(minAddToMakeValid(num));
    }
}
