package DP;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockTwoTransaction {
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
        int lsf = prices[0];
        int mpist = 0;
        int [] dpl = new int[prices.length];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            mpist = prices[i] - lsf;

            dpl[i] = Math.max(mpist, dpl[i - 1]);
        }

        int mpibt = 0;
        int maxat = prices[prices.length -1];
        int [] dpr = new int[prices.length];

        for(int i = prices.length - 2; i >=0; i--){
            if(prices[i] > maxat){
                maxat = prices[i];
            }
            mpibt = maxat - prices[i];

            dpr[i] = Math.max(mpibt, dpr[i + 1]);
        }

        int op = 0;
        for(int i = 0; i < prices.length; i++){
            op = Math.max(op,dpl[i] + dpr[i]);
        }

        return op;
    }
}
