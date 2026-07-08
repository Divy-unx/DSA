package Arrays;
import java.util.Arrays;
class PlusOne{
    static void main(String[] args) {
        int[] arr = {8,9};
        int[] k = Plusone(arr);
        System.out.println(Arrays.toString(k));

    }

    public static int[] Plusone(int [] digits){
        int n = digits.length;

        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
                
            }
            digits[i] = 0;
        }
        int [] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;

    }
}