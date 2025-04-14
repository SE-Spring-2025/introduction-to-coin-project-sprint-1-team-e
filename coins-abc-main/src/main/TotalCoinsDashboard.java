import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;

public class TotalCoinsDashboard extends JFrame 
    implements CoinCountsObserver {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 350;
    private static final int BORDER_PADDING = 10;
    private static final int FONT_SIZE = 12;
    private static final int LABEL_FONT_SIZE = 16;
    
    private JLabel totalCoinsLabel;
    private JTextArea coinArtArea;

    public TotalCoinsDashboard() {
        setTitle("Total Coins Dashboard");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(BORDER_PADDING, BORDER_PADDING));
        
        // Create the ASCII art text area
        coinArtArea = new JTextArea();
        coinArtArea.setEditable(false);
        coinArtArea.setFont(new Font("Monospaced", Font.PLAIN, FONT_SIZE));
        coinArtArea.setBackground(this.getBackground());
        coinArtArea.setText(
            "                      __-----__\n"
            + "                 ..;;;--'~~~`--;;;..\n"
            + "               /;-~IN GOD WE TRUST~-.\\\n"
            + "              //      ,;;;;;;;;      \\\\\n"
            + "            .//      ;;;;;    \\       \\\\\n"
            + "            ||       ;;;;(   /.|       ||\n"
            + "            ||       ;;;;;;;   _\\      ||\n"
            + "            ||       ';;  ;;;;=        ||\n"
            + "            ||LIBERTY | ''\\;;;;;;      ||\n"
            + "             \\\\     ,| '\\  '|><| 1995 //\n"
            + "              \\\\   |     |      \\  A //\n"
            + "               `;.,|.    |      '\\.-'/\n"
            + "                 ~~;;;,._|___.,-;;;~'\n"
            + "                     ''=--'"
        );
        coinArtArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create the counter label with larger font
        totalCoinsLabel = new JLabel("Total Coins: 0", 
            SwingConstants.CENTER);
        totalCoinsLabel.setFont(new Font("SansSerif", Font.BOLD,
            LABEL_FONT_SIZE));
        totalCoinsLabel.setForeground(new Color(50, 50, 150)); // deep blue
        totalCoinsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        totalCoinsLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        
        // Create a panel to hold both components
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(coinArtArea);
        contentPanel.add(Box.createVerticalStrut(BORDER_PADDING));
        contentPanel.add(totalCoinsLabel);
        contentPanel.add(Box.createVerticalGlue());
        
        // Add panel to frame with border padding
        add(contentPanel, BorderLayout.CENTER);
        
        // Add empty border for padding
        contentPanel.setBorder(BorderFactory.createEmptyBorder(
            BORDER_PADDING, 
            BORDER_PADDING, 
            BORDER_PADDING, 
            BORDER_PADDING));
        
        setVisible(true);
    }

    @Override
    public void update(CoinCounts coinCounts) {
        totalCoinsLabel.setText("Total Coins: " 
            + coinCounts.getTotalCoins());
    }
}
