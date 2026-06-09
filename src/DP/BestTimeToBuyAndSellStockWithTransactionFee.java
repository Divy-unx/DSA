package DP;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] prices = new int[n];
        for(int i = 0; i< prices.length; i++){
            prices[i] = scanner.nextInt();
        }

        int fee = scanner.nextInt();
//        int obsp = -prices[0]; // obsp = old brought state profit
//        int ossp = 0; // old sold state profit
//        for(int i = 1; i<prices.length; i++){
//            int nbsp = 0; // new brought state profit
//            int nssp = 0; // new sold state profit
//            if(ossp - prices[i] > obsp){
//                nbsp = ossp - prices[i];
//            }else{
//                nbsp=obsp;
//            }
//            if(obsp + prices[i] - fee > ossp){
//                nssp = obsp + prices[i] - fee;
//            }else{
//                nssp = ossp;
//            }
//            obsp = nbsp;
//            ossp = nssp;
//        }
//        System.out.println(ossp);

        int Profit = MaxProfit(prices, fee);
        System.out.println("Profit : " + Profit);


    }
    public static int MaxProfit(int [] prices , int fee){
        int Hold = -prices[0];
        int Cash = 0;
        for(int i = 1; i < prices.length; i++){

            int NewHold = Math.max(Hold, Cash - prices[i]);
            int NewCash = Math.max(Cash , Hold + prices[i] - fee);

            Hold = NewHold;
            Cash = NewCash;
        }
        return Cash;
    }
}
