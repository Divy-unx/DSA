package DP;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock_Infinite {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] prices = new int[n];
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        int bd = 0;
        int sd = 0;
        int profit = 0;
        for(int i = 1; i< prices.length; i++){
            if(prices[i] >= prices[i-1]){
                sd++;
            }else{
                profit = profit + prices[sd] - prices[bd];
                bd = sd = i;
            }
        }
        profit = profit + prices[sd] - prices[bd];

        System.out.println(profit);
    }
}
