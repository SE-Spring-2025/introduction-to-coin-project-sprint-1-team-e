import javax.swing.*;
import java.awt.*;

public class TotalCoinsDashboard extends JFrame implements CoinCountsObserver {
    private JLabel totalCoinsLabel;

    public TotalCoinsDashboard() {
        setTitle("Total Coins Dashboard");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        totalCoinsLabel = new JLabel("Total Coins: 0");
        add(totalCoinsLabel);

        setVisible(true);
    }

    @Override
    public void update(CoinCounts coinCounts) {
        totalCoinsLabel.setText("Total Coins: " + coinCounts.getTotalCoins());
    }
}
