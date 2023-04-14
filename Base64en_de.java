import java.util.Base64;

public class Base64en_de {

    // Base 64 Encoding
    public static String base64Encode(String message) {
        byte[] messageBytes = message.getBytes();
        byte[] base64Bytes = Base64.getEncoder().encode(messageBytes);
        String base64Message = new String(base64Bytes);
        return base64Message;
    }
  
}
