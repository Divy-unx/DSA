package Arrays;
import java.util.Scanner;

public class ConcatenateNonZero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 0 <= n <= 10**40");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println(0);
        }
        try{
            StringBuilder sb = new StringBuilder();
            String str = String.valueOf(Math.abs(num));
            int sum = 0;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(ch != '0'){
                    sb.append(ch);
                    sum = sum + (ch - '0');
                }
            }
            long val = Long.parseLong(sb.toString());
            System.out.println(sb);
            System.out.println(sum);
            System.out.println(val * sum);

        }catch(Exception e){
            System.out.println(e);

        }

    }
}
