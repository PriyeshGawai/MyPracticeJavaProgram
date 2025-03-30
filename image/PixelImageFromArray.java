package image;
import javax.swing.*;
import java.awt.*;

public class PixelImageFromArray extends JPanel {

    // Sample pixel data (flattened array)
    String[] pixelData = {
        "255,0,0", "0,255,0", "0,0,255", "255,255,0", "255,0,255",
        "0,255,255", "100,100,100", "200,200,200", "0,0,0", "255,255,255",
        "255,0,0", "0,255,0", "0,0,255", "255,255,0", "255,0,255"
    };

    int rows = 3;    // height
    int cols = 5;    // width
    int pixelSize = 40;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int k = 0; // index for pixelData

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (k >= pixelData.length) break;

                // Extract R, G, B from string
                String[] rgb = pixelData[k].split(",");
                int r = Integer.parseInt(rgb[0]);
                int gg = Integer.parseInt(rgb[1]);
                int b = Integer.parseInt(rgb[2]);

                // Set color and draw pixel
                g.setColor(new Color(r, gg, b));
                g.fillRect(j * pixelSize, i * pixelSize, pixelSize, pixelSize);

                k++;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pixel Art from Array");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PixelImageFromArray());
        frame.setVisible(true);
    }
}
