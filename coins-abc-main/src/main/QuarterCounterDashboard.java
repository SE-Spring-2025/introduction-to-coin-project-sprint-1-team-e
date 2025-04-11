import javax.swing.*;
import java.awt.*;

public class QuarterCounterDashboard extends JFrame implements CoinCountsObserver {
    private JLabel quarterCountLabel;

    public QuarterCounterDashboard() {
        setTitle("Quarter Counter Dashboard");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        quarterCountLabel = new JLabel("Quarter Count: 0");
        add(quarterCountLabel);

        setVisible(true);
    }

    @Override
    public void update(CoinCounts coinCounts) {
        quarterCountLabel.setText("Quarter Count: " + coinCounts.getQuarterCount());
    }
}