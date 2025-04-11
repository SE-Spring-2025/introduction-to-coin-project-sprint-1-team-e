/**
 * An observer interface for monitoring changes in CoinCounts.
 * Classes implementing this interface will receive updates whenever
 * the coin count changes.
 * @author Team E
 * @version 1.0
 */
public interface CoinCountsObserver {
    /**
     * Called when the CoinCounts object is updated.
     * @param coinCounts the updated CoinCounts instance
     */
    void update(CoinCounts coinCounts);
}


