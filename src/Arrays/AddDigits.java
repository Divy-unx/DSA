package Arrays;

public class AddDigits{
    public static void main(String[] args){
        int num = 38;
        int n = num;

        while(CountOfDigit(n) > 1){
            int sum = addDigits(num);
            n = sum;
        }
        System.out.println(n);
    }



    public static int CountOfDigit(int n){
        int count = 0;
        if(n==0) return 1;
        while(n>0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int addDigits(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    
}