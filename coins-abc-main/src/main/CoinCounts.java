import java.util.*;

public class CoinCounts {
    private int totalCoins;
    private int quarterCount;
    private List<CoinCountsObserver> observers;

    public CoinCounts() {
        this.totalCoins = 0;
        this.quarterCount = 0;
        this.observers = new ArrayList<>();
    }

    public void addCoin(Coin coin) {
        totalCoins++;
        if (coin.getValue() == Coin.QUARTER_VALUE) {
            quarterCount++;
        }
        notifyObservers();
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public int getQuarterCount() {
        return quarterCount;
    }

    public void addObserver(CoinCountsObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (CoinCountsObserver observer : observers) {
            observer.update(this);
        }
    }
}