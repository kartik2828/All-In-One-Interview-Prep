package arraySolutions;

import java.util.Scanner;

public class buySellStock {

    public static int  maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price:prices){
            if(price<minPrice){
                minPrice = price;
            } else if (price-minPrice>profit) {

                profit = price-minPrice;
            }
        }
        return profit;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockPrice[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(stockPrice));
    }
}











