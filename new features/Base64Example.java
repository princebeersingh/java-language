import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Original string
        String str = "Hello, World!";
        
        // Encode the string
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(str.getBytes());
        
        // Print the encoded string
        System.out.println("Encoded String: " + encodedString);

        Base64.Decoder decoder = Base64.getDecoder();
        
        byte[] decodedBytes = decoder.decode(encodedString);
        String decodedString = new String(decodedBytes);
        
        // Print the decoded string
        System.out.println("Decoded String: " + decodedString);
    }
}

