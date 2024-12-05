import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class CardPanel extends JPanel {
    // Anzahl der Reihen und Spalten
    private static final int ROWS = 4;
    private static final int COLS = 4;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Gitter zeichnen (4x4)
        int cardNumber = 1;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                // Berechnen der Position des Tiles
            	Card c = new Card(Integer.toString(cardNumber));
                int x = col * c.getCardSize();
                int y = row * c.getCardSize();

                // Zeichnen eines Rechtecks (Tile)
                g.setColor(c.getCardColor()); // Farbe der Tiles
                g.fillRect(x, y, c.getCardSize(), c.getCardSize());
                g.setColor(c.getBorderColor()); // Farbe des Rahmens
                g.drawRect(x, y, c.getCardSize(), c.getCardSize());
                g.drawString(c.getContent(), x + c.getCardSize()/2, y + c.getCardSize()/2);
                cardNumber++;
            }
        }
    }
}