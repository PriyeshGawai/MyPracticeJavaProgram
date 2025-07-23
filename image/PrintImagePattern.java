package image;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintImagePattern {
    public static void main(String[] args) throws InterruptedException {
        try {
            BufferedImage image = ImageIO.read(new File("E:\\image.jpg")); // 👉 change path if needed
            
            PrintWriter out = new PrintWriter(new FileWriter("E:\\ambedkar_ascii_art.txt"));//save image
            
            int width = image.getWidth();
            int height = image.getHeight();

            // Resize if image is too large
            int scale = 4; // Adjust this to reduce size
            width /= scale;
            height /= scale;

            System.out.println("Converted ASCII Art:\n");

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    // Sample the pixel from original image
                    int pixel = image.getRGB(x * scale, y * scale);

                    int r = (pixel >> 16) & 0xff;
                    int g = (pixel >> 8) & 0xff;
                    int b = pixel & 0xff;

                    // Calculate gray value
                    int gray = (r + g + b) / 3;

                    // Map to symbol
                    // Better symbol mapping for "close pixels"
                    char symbol;
                    if (gray < 50) symbol = '@';
                    else if (gray < 100) symbol = '#';
                    else if (gray < 150) symbol = '*';
                    else if (gray < 200) symbol = '+';
                    else if (gray < 230) symbol = '.';
                    else symbol = ' ';
                    
                    // DOUBLE print for closeness horizontally
                    System.out.print(symbol);
                    System.out.print(symbol);
                    
                    //saving image in text file
                    out.print(symbol);
                    out.print(symbol);
                    
                }
                out.println();
                System.out.println();
                Thread.sleep(200);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
