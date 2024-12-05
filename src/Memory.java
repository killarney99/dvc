import javax.swing.*;

public class Memory {

    public static void main(String[] args) {
        // Erstellen des Fensters
        JFrame frame = new JFrame("Memory Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Erstellen des Panels, auf dem das Gitter angezeigt wird
        CardPanel panel = new CardPanel();
        frame.add(panel);
        
        // Fenster sichtbar machen
        frame.setVisible(true);
    }
}