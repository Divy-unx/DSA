package Arrays;

public class isPrime{
    static void main(){
        int a = 9;
        boolean result = IsPrime(a);
        System.out.println(result);

    }

    public static boolean IsPrime(int x){

        if(x <= 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
        

    }
        
}
// public class isPrime {
//     public static void main(String[] args) {
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args.length);
//         float x = Float.parseFloat(args[4]);
//         System.out.println(x);
//     }
// }


