package image;

import javax.imageio.ImageIO;

import com.github.lalyos.jfiglet.FigletFont;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FinalPixelArt {

    public static void main(String[] args) throws InterruptedException {
        try {
            // === 1. Load Image ===
            BufferedImage image = ImageIO.read(new File("E:\\img2.jpg")); // Change path if needed

            // === 2. Auto Resize to fit console ===
            int targetWidth = 120; // Adjust depending on console size
            int targetHeight = (int)((double)image.getHeight() / image.getWidth() * targetWidth / 2); // /2 for aspect ratio

            Image tmp = image.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
            BufferedImage resized = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = resized.createGraphics();
            g2d.drawImage(tmp, 0, 0, null);
            g2d.dispose();

            // === 3. Save to file also ===
            PrintWriter out = new PrintWriter(new FileWriter("E:\\tej.txt"));

            // === 4. Define symbols ===
            String symbols = "@#W$*+=. "; // dark --> light

            // === 5. Loop and draw ===
            for (int y = 0; y < targetHeight; y++) {
                for (int x = 0; x < targetWidth; x++) {
                    int pixel = resized.getRGB(x, y);
                    int r = (pixel >> 16) & 0xff;
                    int g = (pixel >> 8) & 0xff;
                    int b = pixel & 0xff;
                   
                 // === Darken the image ===
                    int gray = (int)((r + g + b) / 3 * 1); //0.8 reduce brightness by 20%
                    if (gray > 255) gray = 255;
                    if (gray < 0) gray = 0;

                    char symbol = symbols.charAt(gray * symbols.length() / 256);

                    System.out.print(symbol);
                    System.out.print(symbol); // double width for console
                    out.print(symbol);
                    out.print(symbol);
                    
                }
                System.out.println();
                out.println();
                Thread.sleep(100); // smooth animation
            }
            
            // === 8. Print Tribute Message ===
           
            
            String msg = "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0We"
            		+ "\u00A0\u00A0\u00A0are\u00A0\u00A0\u00A0\u00A0\u00A0because\u00A0\u00A0\u00A0He\u00A0\u00A0\u00A0was";

            char asciiArt[] = FigletFont.convertOneLine(msg).toCharArray();
            System.out.println();
            out.println();
          for(char s: asciiArt) {
        	
        	  System.out.print(s);
              out.print(s);  
          }
//            System.out.println(asciiArt);
//            out.println(asciiArt);

            //System.out.println("\n✔ Pixel Art with Tribute Saved to E:\\ambedkar_tribute_art.txt");

            out.flush();
            out.close();
            //System.out.println("✔ Pixel Art Printed & Saved to E:\\ambedkar_ascii_art.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
