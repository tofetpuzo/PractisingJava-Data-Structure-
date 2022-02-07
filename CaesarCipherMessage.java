package PractiseJavaDataStructure;

/** Class for doing encryption and decryption using the Caesar Cipher */
public class CaesarCipherMessage {
    protected char[] encoder_message = new char[26];
    protected char[] decoder_message = new char[26];

    /** Constructor that initialises the encoder_message and encoder_message */

    public CaesarCipherMessage(int mesage_rotation) {
        for (int j = 0; j < 26; j++) {
            encoder_message[j] = (char) ('A' + (j + mesage_rotation) % 26);
            decoder_message[j] = (char) ('A' + (j - mesage_rotation + 26) % 26);
        }

    }

    /* Returns String representing encrypted message */
    public String encryption(String message) {
        return transform(message, encoder_message); // use this as encoder array.
    }

    /* Returns decrypted message given encrypted message */
    public String decryption(String secret_message) {
        return transform(secret_message, decoder_message); // use this as a decoder array.
    }

    /** Returns a transformation of original String using given code */
    public String transform(String original_message, char[] code_character_to_replace) {
        char[] msg = original_message.toCharArray();
        for (int k = 0; k < msg.length; k++) {
            if (Character.isUpperCase(msg[k])) {
                int j = msg[k] - 'A';
                msg[k] = code_character_to_replace[j];
            }
        }
        return new String(msg);
    }

    /** Simple main method for testing the caesar cipher */
    public static void main(String[] args) {
        CaesarCipherMessage cipher = new CaesarCipherMessage(3);
        System.out.println("Encrypted code = " + new String(cipher.encoder_message));
        System.out.println("Decrypted code = " + new String(cipher.decoder_message));
        String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S. ";
        String coded = cipher.encryption(message);
        System.out.println("Secret: " + coded);
        String answer = cipher.decryption(coded);
        System.out.println("Message: " + answer);

    }

}