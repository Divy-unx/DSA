package DP;
import java.util.Scanner;

public class BestTimeToBuyAndSellStockCoolDown {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = scanner.nextInt();
        }
        System.out.println("Profit: " + MaxProfit(prices));
    }
    public static int MaxProfit(int [] prices){
        int hold = -prices[0];
        int cash = 0;
        int cool = 0;
        for(int i = 1; i < prices.length; i++){
            int NewHold = Math.max(hold, cool - prices[i]);
            int NewCash = Math.max(cash,hold + prices[i]);
            int NewCool = Math.max(cash, cool);
            hold = NewHold;
            cash = NewCash;
            cool = NewCool;
        }
        return cash;
    }
}

