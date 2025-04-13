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
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        quarterCountLabel = new JLabel("Quarter Count: 0");
        quarterCountLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        quarterCountLabel.setForeground(new Color(50, 50, 150)); // Dark blue
        quarterCountLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        quarterCountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(quarterCountLabel);

        getContentPane().setBackground(Color.WHITE);
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