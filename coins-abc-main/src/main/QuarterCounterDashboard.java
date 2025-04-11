import javax.swing.*;
import java.awt.*;

public class QuarterCounterDashboard extends JFrame implements CoinCountsObserver {
    private JLabel quarterCountLabel;
    private JTextArea quarterArtArea;

    public QuarterCounterDashboard() {
        setTitle("Quarter Counter Dashboard");
        setSize(400, 350); // Increased size to fit ASCII art
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // Use BorderLayout with padding
        
        // Create the ASCII art text area
        quarterArtArea = new JTextArea();
        quarterArtArea.setEditable(false);
        quarterArtArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        quarterArtArea.setBackground(this.getBackground());
        quarterArtArea.setText(
            "                    _.-'~~`~~'-._\n" +
            "                 .'`  B   E   R  `'.\n" +
            "                / I               T \\\n" +
            "              /`       .-'~\"-.       `\\\n" +
            "             ; L      / `-    \\      Y ;\n" +
            "            ;        />  `.  -.|        ;\n" +
            "            |       /_     '-.__)       |\n" +
            "            |        |-  _.' \\ |        |\n" +
            "            ;        `~~;     \\\\        ;\n" +
            "             ;  INGODWE /      \\\\)P    ;\n" +
            "              \\  TRUST '.___.-'`\"     /\n" +
            "               `\\                   /`\n" +
            "                 '._   1 9 9 7   _.'\n" +
            "                    `'-..,,,..-'`"
            );
        quarterArtArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create the counter label with larger font
        quarterCountLabel = new JLabel("Quarter Count: 0", SwingConstants.CENTER);
        quarterCountLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        quarterCountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create a panel to hold both components
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(Box.createVerticalGlue()); // Center vertically
        contentPanel.add(quarterArtArea);
        contentPanel.add(Box.createVerticalStrut(10)); // Add spacing
        contentPanel.add(quarterCountLabel);
        contentPanel.add(Box.createVerticalGlue()); // Center vertically
        
        // Add panel to frame with border padding
        add(contentPanel, BorderLayout.CENTER);
        
        // Add empty border for padding
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        setVisible(true);
    }

    @Override
    public void update(CoinCounts coinCounts) {
        quarterCountLabel.setText("Quarter Count: " + coinCounts.getQuarterCount());
    }
}