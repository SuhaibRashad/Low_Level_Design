package BehaviouralPatterns.ObserverPattern.StockPrice;

public interface Observer {
    void update(String stockSymbol, double newPrice);
}
