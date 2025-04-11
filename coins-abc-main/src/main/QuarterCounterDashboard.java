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

public class QuarterCounterDashboard extends JFrame 
    implements CoinCountsObserver {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 350;
    private static final int BORDER_PADDING = 10;
    private static final int FONT_SIZE = 12;
    private static final int LABEL_FONT_SIZE = 16;
    
    private JLabel quarterCountLabel;
    private JTextArea quarterArtArea;

    public QuarterCounterDashboard() {
        setTitle("Quarter Counter Dashboard");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(BORDER_PADDING, BORDER_PADDING));
        
        // Create the ASCII art text area
        quarterArtArea = new JTextArea();
        quarterArtArea.setEditable(false);
        quarterArtArea.setFont(new Font("Monospaced", Font.PLAIN, FONT_SIZE));
        quarterArtArea.setBackground(this.getBackground());
        quarterArtArea.setText(
            "                    _.-'~~`~~'-._\n"
            + "                 .'`  B   E   R  `'.\n"
            + "                / I               T \\\n"
            + "              /`       .-'~\"-.       `\\\n"
            + "             ; L      / `-    \\      Y ;\n"
            + "            ;        />  `.  -.|        ;\n"
            + "            |       /_     '-.__)       |\n"
            + "            |        |-  _.' \\ |        |\n"
            + "            ;        `~~;     \\\\        ;\n"
            + "             ;  INGODWE /      \\\\)P    ;\n"
            + "              \\  TRUST '.___.-'`\"     /\n"
            + "               `\\                   /`\n"
            + "                 '._   1 9 9 7   _.'\n"
            + "                    `'-..,,,..-'`"
        );
        quarterArtArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create the counter label with larger font
        quarterCountLabel = new JLabel("Quarter Count: 0", 
            SwingConstants.CENTER);
        quarterCountLabel.setFont(new Font("SansSerif", Font.BOLD,
            LABEL_FONT_SIZE));
        quarterCountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Create a panel to hold both components
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(quarterArtArea);
        contentPanel.add(Box.createVerticalStrut(BORDER_PADDING));
        contentPanel.add(quarterCountLabel);
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
        quarterCountLabel.setText("Quarter Count: " 
            + coinCounts.getQuarterCount());
    }
}
