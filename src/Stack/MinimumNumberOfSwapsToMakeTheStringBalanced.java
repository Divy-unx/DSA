package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '['){
                stack.push(ch);
            }else{
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
            }
        }

        return (stack.size() + 1) / 2;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        System.out.println(minSwaps(num));
    }
}
