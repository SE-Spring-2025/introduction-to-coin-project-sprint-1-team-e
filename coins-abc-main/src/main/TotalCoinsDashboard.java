import javax.swing.*;
import java.awt.*;

/**
 *  A GUI dashboard that displays the total number of coins in a CoinCounts object.
 * Implements the CoinCountsObserver interface to update the display when the coin count changes.
 * @author Team E
 * @version 1.0
 */
public class TotalCoinsDashboard extends JFrame implements CoinCountsObserver {
    private JLabel totalCoinsLabel;

    /**
     * Constructs a TotalCoinsDashboard with default settings.
     * Initializes the JFrame and sets up the total coins display.
     */
    public TotalCoinsDashboard() {
        setTitle("Total Coins Dashboard");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        totalCoinsLabel = new JLabel("Total Coins: 0");
        totalCoinsLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        totalCoinsLabel.setForeground(new Color(50, 50, 150)); // Dark blue
        totalCoinsLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        totalCoinsLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // For BoxLayout

        add(totalCoinsLabel);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    /**
     * Updates the displayed total coin count based on the CoinCounts object.
     *
     * @param coinCounts the updated CoinCounts instance containing the total coin count
     */
    @Override
    public void update(CoinCounts coinCounts) {
        totalCoinsLabel.setText("Total Coins: " + coinCounts.getTotalCoins());
    }
}
