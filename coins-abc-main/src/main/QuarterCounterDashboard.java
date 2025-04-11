import javax.swing.*;
import java.awt.*;

/**
 * A GUI dashboard that displays the count of quarters in a CoinCounts object.
 * Implements the CoinCountsObserver interface to update the display when the coin count changes.
 * @author Team E
 * @version 1.0
 */
public class QuarterCounterDashboard extends JFrame implements CoinCountsObserver {
    private JLabel quarterCountLabel;

    /**
     * Constructs a QuarterCounterDashboard with default settings.
     * Initializes the JFrame and sets up the quarter count display.
     */
    public QuarterCounterDashboard() {
        setTitle("Quarter Counter Dashboard");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        quarterCountLabel = new JLabel("Quarter Count: 0");
        add(quarterCountLabel);

        setVisible(true);
    }

    /**
     * Updates the displayed quarter count based on the CoinCounts object.
     * @param coinCounts coinCounts the updated CoinCounts instance containing the quarter count
     */
    @Override
    public void update(CoinCounts coinCounts) {
        quarterCountLabel.setText("Quarter Count: " + coinCounts.getQuarterCount());
    }
}