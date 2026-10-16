package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static String removeKDigits(String num, int k) {

        if (num.length() == k){
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k>0 && ch < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }


        while(k > 0) {
            stack.pop();
            k--;
        }

        for (int i = 0; i < stack.size(); i++){
            sb.append(stack.elementAt(i));
        }

        while(!sb.isEmpty() && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
//            if (sb.isEmpty()){
//                return "0";
//            }
        }

        return sb.toString();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(removeKDigits(num,k));
    }
}
