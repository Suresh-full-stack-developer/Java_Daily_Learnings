package imagePrint;

import java.awt.image.BufferedImage;

import java.io.File;
import javax.imageio.ImageIO;

public class ImagePattern {

    public static void main(String[] args) throws InterruptedException {

    	
    	
    		System.out.print("Loding");

	        for (int i = 1; i <=10; i++) {
	        	System.out.print(".");
	        //	System.err.print('\u0007');
	        	System.err.print("💕");
	            Thread.sleep(500); 
	           

	        }
	        System.out.println("\nLoading completed!");

    	
    	
        try {
        	//Surya	
        	//  File file = new File("E:/QSpiders/Wallpaper/aa12448b2dfdb494195c8cd8a60a66aa (1).jpg");
        	//File file = new File("C:/Qsp_Java/black and white.jpeg");
        	File file = new File("C:/Qsp_Java/Thalapathy.jpeg");
        	//  File file = new File("C:/Users/ASUS/Downloads/vijay4.jpg");
        	//  File file = new File("C:/Users/ASUS/Downloads/vijay3.jpg");

            BufferedImage img = ImageIO.read(file);

            if (img == null) {
                System.out.println(" Image not found or unsupported format");
                return;
            }

            int newWidth = 250;
            int newHeight = (img.getHeight() * newWidth) / img.getWidth();
            newHeight = newHeight / 2; 

            String chars = "@#%*+=-:. ";

            for (int y = 0; y < newHeight; y++) {

                for (int x = 0; x < newWidth; x++) {

                    int px = x * img.getWidth() / newWidth;
                    int py = y * img.getHeight() / newHeight;

                    int pixel = img.getRGB(px, py);

                    int r = (pixel >> 16) & 0xff;
                    int g = (pixel >> 8) & 0xff;	
                    int b = pixel & 0xff;

                    int gray = (int)(0.299 * r + 0.587 * g + 0.114 * b);

                    int index = gray * (chars.length() - 1) / 255;

                    Thread.sleep(2);
                    System.out.print(chars.charAt(index));
                }

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}