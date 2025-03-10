package BehaviouralPatterns.ObserverPattern.StockPrice;

import java.util.Scanner;

public class Client {
    public static void run() {

        Scanner sc = new Scanner(System.in);

        double priceChangeThreshold = sc.nextDouble();
        StockMarket stockMarket = new StockMarket(priceChangeThreshold);

        InvestorA investorA = new InvestorA();
        InvestorB investorB = new InvestorB();

        // TODO: Register Investor A as an observer to receive stock updates.

        stockMarket.registerObserver(investorA);
        // TODO: Register Investor B as an observer to receive stock updates.
        stockMarket.registerObserver(investorB);


        int updates = sc.nextInt();

        for (int i = 1; i <= updates; i++) {

            if(i == 5) {
                // TODO: Remove Investor B from receiving notifications after the 4th update.
                stockMarket.removeObserver(investorB);

            }

            String stockSymbol = sc.next();
            double newPrice = sc.nextDouble();
            double oldPrice = sc.nextDouble();

            // TODO: Update the stock price
            stockMarket.setStockPrice(stockSymbol,newPrice,oldPrice);

        }
        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
