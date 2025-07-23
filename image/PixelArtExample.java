package image;
import javax.swing.*;
import java.awt.*;

public class PixelArtExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int pixelSize = 20; // size of each "pixel"

        // Example 10x10 pixels image (2D array)
        Color[][] pixelArt = {
            {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE},
            {Color.CYAN, Color.MAGENTA, Color.PINK, Color.GRAY, Color.BLACK},
            {Color.LIGHT_GRAY, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW},
            {Color.ORANGE, Color.CYAN, Color.MAGENTA, Color.PINK, Color.GRAY},
            {Color.BLACK, Color.LIGHT_GRAY, Color.RED, Color.GREEN, Color.BLUE}
        };

        for(int i=0; i<pixelArt.length; i++) {
        	
            for(int j=0; j<pixelArt[i].length; j++) {
            	
                g.setColor(pixelArt[i][j]);
                g.fillRect(j * pixelSize, i * pixelSize, pixelSize, pixelSize);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pixel Art Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PixelArtExample());
        frame.setVisible(true);
    }
}
