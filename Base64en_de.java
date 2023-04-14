import java.util.Base64;

public class Base64en_de {

    // Base 64 Encoding
    public static String base64Encode(String message) {
        byte[] messageBytes = message.getBytes();
        byte[] base64Bytes = Base64.getEncoder().encode(messageBytes);
        String base64Message = new String(base64Bytes);
        return base64Message;
    }
        // Base 64 Decoding
    public static String base64Decode(String base64Message) {
        byte[] base64Bytes = base64Message.getBytes();
        byte[] messageBytes = Base64.getDecoder().decode(base64Bytes);
        String message = new String(messageBytes);
        return message;
    }
  
    public static void main(String[] args) {
        // Encode a message
        String message = "Kjo është detyra e dytë, nga grupi 16!";
        String encodedMessage = base64Encode(message);
        System.out.println(encodedMessage);

        // Decode a message
        String decodedMessage = base64Decode(encodedMessage);
        System.out.println(decodedMessage);
}
