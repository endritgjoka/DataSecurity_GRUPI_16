import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Picture {
    public static void main(String[] args) throws Exception {
        // Load the image into the bytes array
        byte[] imageBytes = Files.readAllBytes(Paths.get("C:\\Users\\ccc\\Pictures\\Saved Pictures\\Solid_black.jpg"));
        
         // Encode the string of bytes
        String base64EncodedImage = Base64.getEncoder().encodeToString(imageBytes);
        System.out.println("Encoded image: " + base64EncodedImage);
      
      
    }
}
