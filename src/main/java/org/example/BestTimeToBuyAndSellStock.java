package org.example;

//problem 121 of leetcode
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int profit=0;
        int costPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=prices[i]-costPrice;
            if(profit<0){
                costPrice=prices[i];
            }
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
