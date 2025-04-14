import javax.swing.*;
import java.awt.*;

public class PennyArtPanel extends JPanel {
    private final String[] art = {
        "         __ ----- __         ",
        "     ..;;;--'~~~`--;;;..     ",
        "   /;-~IN GOD WE TRUST~-.\\   ",
        "  //      ,;;;;;;;;      \\\\  ",
        ".//      ;;;;;    \\       \\\\ ",
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
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int size = Math.min(getWidth(), getHeight());
        int diameter = (int)(size * 0.8);
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        int fontSize = Math.max(12, diameter / 20);
        Font font = new Font("Monospaced", Font.PLAIN, fontSize);
        g2.setFont(font);
        // Copper color for penny
        g2.setColor(new Color(184, 115, 51));
        g2.fillOval(x, y, diameter, diameter);
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
