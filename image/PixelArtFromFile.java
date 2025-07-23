package image;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class PixelArtFromFile extends JPanel {

    ArrayList<Color> pixelColors = new ArrayList<>();
    int imageWidth;
    int imageHeight;
    int pixelSize = 2; // adjust according to your resolution

    public PixelArtFromFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("E:\\ambedkar_pixels.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            for (int i = 0; i < tokens.length - 2; i += 3) {
                int r = Integer.parseInt(tokens[i].replace("\"", "").trim());
                int g = Integer.parseInt(tokens[i + 1].replace("\"", "").trim());
                int b = Integer.parseInt(tokens[i + 2].replace("\"", "").trim());
                pixelColors.add(new Color(r, g, b));
            }
            imageWidth = tokens.length / 3;
        }
        imageHeight = pixelColors.size() / imageWidth;
        br.close();
    }

    public void paint(Graphics g) {
        int i = 0;
//        for (int y = 0; y < imageHeight; y++) {
//            for (int x = 0; x < imageWidth; x++) {
//                if (i < pixelColors.size()) {
//                    g.setColor(pixelColors.get(i++));
//                    g.fillRect(x * pixelSize, y * pixelSize, pixelSize, pixelSize);
//                    try {
//                        Thread.sleep(2); // control speed
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
        
        for (int y = 0; y < imageHeight; y++) {
            for (int x = 0; x < imageWidth; x++) {
                Color c = pixelColors.get(y * imageWidth + x);
                int gray = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
                if (gray < 100) System.out.print("*");
                else if (gray < 180) System.out.print("+");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Dr. B. R. Ambedkar Pixel Art");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new PixelArtFromFile());
        frame.setVisible(true);
    }
}
