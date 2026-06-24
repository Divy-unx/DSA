package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = fizzBuzz(n);
        System.out.println(ans);
    }
    public static List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            if(i % 15 == 0){
                str.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                str.add("Fizz");
            }
            else if(i % 5 == 0){
                str.add("Buzz");
            }
            else{
                str.add(String.valueOf(i));
            }
        }
        return str;
    }
}
