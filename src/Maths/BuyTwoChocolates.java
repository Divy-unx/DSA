package Maths;

import java.util.Scanner;

public class BuyTwoChocolates {
    public static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min2 = min;
                min = price;
            }else{
                min2 = Math.min(min2,price);
            }
        }
        int overall = min + min2;
        if( overall <= money){
            return money - overall;
        }else{
            return money;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int money = sc.nextInt();
        int [] nums1 = new int[num1];

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println(buyChoco(nums1,money));
    }
}
