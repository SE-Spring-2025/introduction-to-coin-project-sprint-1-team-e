import java.util.*;

/**
 * The CoinCounts class maintains a count of total coins and quarters,
 * and notifies registered observers of any changes.
 * @author Team E
 * @version 1.0
 */
public class CoinCounts {
    private int totalCoins;
    private int quarterCount;
    private ArrayList<CoinCountsObserver> observers;

    /**
     * Initializes a CoinCounts object with zero coins and an empty
     * observer list.
     */
    public CoinCounts() {
        this.totalCoins = 0;
        this.quarterCount = 0;
        this.observers = new ArrayList<>();
    }

    /**
     * Adds a coin to the total count.
     * If the coin is a quarter, it increments the quarter count.
     * Notifies all registered observers of the update.
     * @param coin the coin to add
     */
    public void addCoin(Coin coin) {
        totalCoins++;
        if (coin.getValue() == Coin.QUARTER_VALUE) {
            quarterCount++;
        }
        notifyObservers();
    }

    /**
     * Returns the total number of coins.
     * @return totalCoins
     */
    public int getTotalCoins() {
        return totalCoins;
    }

    /**
     * Returns the total amount of quarters.
     * @return quarterCount
     */
    public int getQuarterCount() {
        return quarterCount;
    }

    /**
     * Adds an observer to the observer list.
     * @param observer the observer to register
     */
    public void addObserver(CoinCountsObserver observer) {
        observers.add(observer);
    }

    /**
     * Notifies all observers that the coin count has changed.
     */
    private void notifyObservers() {
        for (CoinCountsObserver observer : observers) {
            observer.update(this);
        }
    }
}