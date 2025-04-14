import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

/**
 * A GUI dashboard that displays the count of quarters in a CoinCounts object.
 * Implements the CoinCountsObserver interface to update the display when the
 * coin count changes.
 * 
 * @author Team E
 * @version 1.0
 */
public class QuarterCounterDashboard extends JFrame
            implements CoinCountsObserver {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 400;
    private static final int MIN_WIDTH = 350;
    private static final int MIN_HEIGHT = 350;
    private static final int LABEL_FONT_SIZE = 18;
    private static final int LABEL_BORDER_TOP = 20;
    private static final int LABEL_BORDER_LEFT = 0;
    private static final int LABEL_BORDER_BOTTOM = 0;
    private static final int LABEL_BORDER_RIGHT = 0;
    private static final Color LABEL_COLOR =
        new Color(50, 50, 150);
    private static final Color BG_COLOR = Color.WHITE;
    private JLabel quarterCountLabel;
    private QuarterArtPanel quarterArtPanel;

    /**
     * Constructs a QuarterCounterDashboard with default settings.
     * Initializes the JFrame and sets up the quarter count display.
     */
    public QuarterCounterDashboard() {
        setTitle("Quarter Counter Dashboard");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setMinimumSize(
            new Dimension(MIN_WIDTH, MIN_HEIGHT)
        );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(
            new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)
        );

        quarterArtPanel = new QuarterArtPanel();
        quarterArtPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(quarterArtPanel);

        // Create the quarter count label
        quarterCountLabel = new JLabel("Quarter Count: 0");
        quarterCountLabel.setFont(
            new Font("SansSerif", Font.BOLD, LABEL_FONT_SIZE)
        );
        quarterCountLabel.setForeground(LABEL_COLOR);
        quarterCountLabel.setBorder(
            BorderFactory.createEmptyBorder(
                LABEL_BORDER_TOP,
                LABEL_BORDER_LEFT,
                LABEL_BORDER_BOTTOM,
                LABEL_BORDER_RIGHT
            )
        );
        quarterCountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(quarterCountLabel);

        getContentPane().setBackground(BG_COLOR);
        setVisible(true);
    }

    /**
     * Updates the displayed quarter count based on the CoinCounts object.
     * 
     * @param coinCounts coinCounts the updated CoinCounts instance 
     * containing the quarter count
     *                   
     */
    @Override
    public void update(CoinCounts coinCounts) {
        quarterCountLabel.setText(
            "Quarter Count: " + coinCounts.getQuarterCount()
        );
    }
}
