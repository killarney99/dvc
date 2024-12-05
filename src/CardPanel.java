import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class CardPanel extends JPanel {
    // Anzahl der Reihen und Spalten
    private static final int ROWS = 4;
    private static final int COLS = 4;
    
    // Größe eines einzelnen Cards
    private static final int CARD_SIZE = 80;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Gitter zeichnen (4x4)
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                // Berechnen der Position des Tiles
                int x = col * CARD_SIZE;
                int y = row * CARD_SIZE;

                // Zeichnen eines Rechtecks (Tile)
                g.setColor(Color.LIGHT_GRAY); // Farbe der Tiles
                g.fillRect(x, y, CARD_SIZE, CARD_SIZE);
                g.setColor(Color.BLACK); // Farbe des Rahmens
                g.drawRect(x, y, CARD_SIZE, CARD_SIZE);
            }
        }
    }
}