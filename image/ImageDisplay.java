package image;

import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JPanel {

    private Image image;

    // Load image in constructor
    public ImageDisplay() {							
        image = Toolkit.getDefaultToolkit().getImage("E:\\image.jpg");  // <-- your image path
    }

    // Paint the image on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Set window size

        ImageDisplay panel = new ImageDisplay();
        frame.add(panel);

        frame.setVisible(true);
    }
}
