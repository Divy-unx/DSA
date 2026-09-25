package String;

import java.util.Scanner;

public class CountAndSay {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(countAndSay(num));
    }
    public static String countAndSay(int n) {

        if(n==1){
            return "1";
        }

        StringBuilder result = new StringBuilder();
        String say = countAndSay(n-1);
        for(int i = 0; i < say.length(); i++){
            char ch = say.charAt(i);

            int count = 1;

            while(i < say.length() - 1 && say.charAt(i) == say.charAt(i+1)){
                count++;
                i++;
            }

            result.append(count).append(ch);
        }

        return result.toString();
    }
}
