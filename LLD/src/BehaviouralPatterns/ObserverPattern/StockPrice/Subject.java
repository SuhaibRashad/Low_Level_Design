package BehaviouralPatterns.ObserverPattern.StockPrice;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String stockSymbol, double newPrice);
}