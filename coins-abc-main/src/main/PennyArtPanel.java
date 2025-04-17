import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PennyArtPanel extends JPanel {
    private static final int PANEL_SIZE = 400;
    private static final int MIN_FONT_SIZE = 12;
    private static final int FONT_DIVISOR = 20;
    private static final double DIAMETER_RATIO = 0.8;
    private static final Color COIN_COLOR = new Color(184, 115, 51);
    private static final Color ART_COLOR = new Color(30, 30, 30);
    private final String[] art = {
        "         __ ----- __         ",
        "     ..;;;--'~~~`--;;;..     ",
        "   /;-~IN GOD WE TRUST~-.\\   ",
        "  //      ,;;;;;;;;      \\  ",
        ".//      ;;;;;    \\       \\ ",
        "||       ;;;;(   /.|       || ",
        "||       ;;;;;;;   _\\      || ",
        "||       ';;  ;;;;=        || ",
        "||LIBERTY | ''\\;;;;;;      || ",
        " \\     ,| '\\  '|><| 1995 // ",
        "  \\   |     |      \\  A //  ",
        "   `;.,|.    |      '\\.-'/   ",
        "     ~~;;;,._|___.,-;;;~'     ",
        "         ''=--'               "
    };

    public PennyArtPanel() {
        setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int size = Math.min(getWidth(), getHeight());
        int diameter = (int) (size * DIAMETER_RATIO);
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        int fontSize = Math.max(MIN_FONT_SIZE, diameter / FONT_DIVISOR);
        Font font = new Font("Monospaced", Font.PLAIN, fontSize);
        g2.setFont(font);
        g2.setColor(COIN_COLOR);
        g2.fillOval(x, y, diameter, diameter);
        FontMetrics fm = g2.getFontMetrics();
        int lineHeight = fm.getHeight();
        int artHeight = art.length * lineHeight;
        int startY = y + (diameter - artHeight) / 2 + fm.getAscent();
        g2.setColor(ART_COLOR);
        for (int i = 0; i < art.length; i++) {
            String line = art[i];
            int lineWidth = fm.stringWidth(line);
            int startX = (getWidth() - lineWidth) / 2;
            g2.drawString(line, startX, startY + i * lineHeight);
        }
    }
}
