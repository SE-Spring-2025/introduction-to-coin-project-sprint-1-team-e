import javax.swing.*;
import java.awt.*;

public class TotalCoinsDashboard extends JFrame implements CoinCountsObserver {
    private JLabel totalCoinsLabel;
    private JTextArea coinArtArea;

    public TotalCoinsDashboard() {
        setTitle("Total Coins Dashboard");
        setSize(400, 350); // Same size as QuarterDashboard
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout with padding
        
        // Create the ASCII art text area
        coinArtArea = new JTextArea();
        coinArtArea.setEditable(false);
        coinArtArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        coinArtArea.setBackground(this.getBackground());
        coinArtArea.setText(
            "                      __-----__\n" +
            "                 ..;;;--'~~~`--;;;..\n" +
            "               /;-~IN GOD WE TRUST~-.\\\n" +
            "              //      ,;;;;;;;;      \\\\\n" +
            "            .//      ;;;;;    \\       \\\\\n" +
            "            ||       ;;;;(   /.|       ||\n" +
            "            ||       ;;;;;;;   _\\      ||\n" +
            "            ||       ';;  ;;;;=        ||\n" +
            "            ||LIBERTY | ''\\;;;;;;      ||\n" +
            "             \\\\     ,| '\\  '|><| 1995 //\n" +
            "              \\\\   |     |      \\  A //\n" +
            "               `;.,|.    |      '\\.-'/\n" +
            "                 ~~;;;,._|___.,-;;;~'\n" +
            "                     ''=--'"
        );
        coinArtArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create the  label with larger font
        totalCoinsLabel = new JLabel("Total Coins: 0", SwingConstants.CENTER);
        totalCoinsLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        totalCoinsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create a panel to hold both components
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(Box.createVerticalGlue()); // Center vertically
        contentPanel.add(coinArtArea);
        contentPanel.add(Box.createVerticalStrut(10)); // Add spacing
        contentPanel.add(totalCoinsLabel);
        contentPanel.add(Box.createVerticalGlue()); // Center vertically
        
        // Add panel to frame with border padding
        add(contentPanel, BorderLayout.CENTER);
        
        // Add empty border for padding
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        setVisible(true);
    }

    @Override
    public void update(CoinCounts coinCounts) {
        totalCoinsLabel.setText("Total Coins: " + coinCounts.getTotalCoins());
    }
}
