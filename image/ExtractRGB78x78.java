package image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExtractRGB78x78 {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("E:\\image.jpg")); // <-- change path if needed
        
        PrintWriter out = new PrintWriter(new FileWriter("E:\\ambedkar_pixels.txt"));
        for (int y = 0; y < image.getWidth(); y++) {
            for (int x = 0; x < image.getHeight(); x++) {
                int pixel = image.getRGB(x, y);
                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = (pixel) & 0xff;
               // System.out.print("\"" + r + "," + g + "," + b + "\",");
                out.print("\"" + r + "," + g + "," + b + "\",");
            }
           // System.out.println();
            out.println();
        }
        out.flush();
        out.close();
        System.out.println("Pixel array saved!");
    }
}

