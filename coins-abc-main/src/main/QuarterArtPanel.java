import javax.swing.*;
import java.awt.*;

public class QuarterArtPanel extends JPanel {
    private final String[] art = {
        "         .-'~~`~~'-._          ",
        "     .'`  B   E   R  `'.      ",
        "    / I               T \\     ",
        "  /`       .-'~\"-.       `\\  ",
        " ; L      / `-    \\      Y ; ",
        ";        />  `.  -.|        ; ",
        "|       /_     '-.__)       | ",
        "|        |-  _.' \\ |        | ",
        ";        `~~;     \\\\        ; ",
        " ;  INGODWE /      \\\\)P    ; ",
        "  \\  TRUST '.___.-'`\"     /  ",
        "   `\\                   /`    ",
        "     '._   1 9 9 7   _.'      ",
        "         `'-..,,,..-'`        "
    };

    public QuarterArtPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        // Calculate optimal circle size
        int size = Math.min(getWidth(), getHeight());
        int diameter = (int)(size * 0.8); // Use 80% of the available space
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        // Calculate font size based on circle diameter
        int fontSize = Math.max(12, diameter / 20);
        Font font = new Font("Monospaced", Font.PLAIN, fontSize);
        g2.setFont(font);
        
        // Draw the coin circle
        g2.setColor(new Color(120, 120, 120));
        g2.fillOval(x, y, diameter, diameter);
        
        // Draw the ASCII art
        FontMetrics fm = g2.getFontMetrics();
        int lineHeight = fm.getHeight();
        int artHeight = art.length * lineHeight;
        int startY = y + (diameter - artHeight) / 2 + fm.getAscent();
        
        g2.setColor(new Color(30, 30, 30));
        for (int i = 0; i < art.length; i++) {
            String line = art[i];
            int lineWidth = fm.stringWidth(line);
            int startX = (getWidth() - lineWidth) / 2;
            g2.drawString(line, startX, startY + i * lineHeight);
        }
    }
}