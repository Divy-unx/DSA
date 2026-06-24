package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean CLosingBracket(Stack<Character> stack,  char correctBracket){
        if(stack.isEmpty()){
            return false;
        }else if(stack.peek() != correctBracket){
            return false;
        }else{
            stack.pop();
            return true;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '(' ){
                stack.push(ch);
            }
           else if(ch == ')'){
               boolean val = CLosingBracket(stack, '(');
               if(!val){
                   System.out.println(val);
                   return;
               }
            }
            else if(ch == '}'){
                boolean val = CLosingBracket(stack, '{');
                if(!val){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == ']'){
                boolean val = CLosingBracket(stack, '[');
                if(!val){
                    System.out.println(val);
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
