package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEval {
    public static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        }
        else if(op == '-'){
            return v1 - v2;
        }
        else if(op == '*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }

    public static void postfix(String s){
        Stack<Integer>  vs = new Stack<>();
        Stack<String>  is = new Stack<>();
        Stack<String>  ps = new Stack<>();

        for (int i  = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                vs.push(operation(v1,v2,ch));

                String is2 = is.pop();
                String is1 = is.pop();
                String res = '(' + is1 + ch + is2 + ')';
                is.push(res);

                String ps2 = ps.pop();
                String ps1 = ps.pop();
                String result = ch + ps1 + ps2;
                ps.push(result);

            }else{
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());

    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();
        postfix(exp);
    }
}
