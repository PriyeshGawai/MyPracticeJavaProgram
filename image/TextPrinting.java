package image;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class TextPrinting {

    public static void main(String[] args) throws InterruptedException {
        try {
            // === 1. Load and process your image as before ===
            // Your existing image processing code here...

            // === 2. Print the ASCII Art Text Below the Image ===
            String message = "We  are  because  He  was";
            String asciiArt = FigletFont.convertOneLine(message);

            System.out.println(asciiArt);
           // out.println(asciiArt);

           // out.close();
            System.out.println("\n✔ Pixel Art with Tribute Saved to E:\\ambedkar_tribute_art.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
