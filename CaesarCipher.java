package PractiseJavaDataStructure;

public class CaesarCipher {

    char[] encode_message = new char[26];
    char[] decode_message = new char[26];
    char[] encode_message_small = new char[26];
    char[] decode_message_small = new char[26];

    public CaesarCipher(int rotation) {
        for (int i = 0; i < 26; i++) {
            encode_message[i] = (char) ('A' + (i + rotation) % 26);
            decode_message[i] = (char) ('A' + (i - rotation + 26) % 26);
            encode_message_small[i] = (char) ('a' + (i + rotation) % 26);
            decode_message_small[i] = (char) ('a' + (i - rotation + 26) % 26);
        }

    }

    public String decrpyt_message(String msg) {
        return transformMessage(msg, decode_message, decode_message_small);
    }

    public String encrpyt_message(String msg) {
        return transformMessage(msg, encode_message, encode_message_small);
    }

    private String transformMessage(String message, char[] mesg, char[] me) {
        char[] msg = message.toCharArray();
        for (int j = 0; j < msg.length; j++) {
            if (Character.isUpperCase(msg[j])) {
                int k = msg[j] - 'A';
                msg[j] = mesg[k];
            } else if (Character.isLowerCase(msg[j])) {
                int k = msg[j] - 'a';
                msg[j] = me[k];
            }
            // return new String(msg);
        }
        return new String(msg);
    }

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(23);
        System.out.println("Encryption code " + new String(cipher.encode_message_small));
        System.out.println("Deryption code " + new String(cipher.decode_message_small));
        System.out.println("Encryption code " + new String(cipher.encode_message));
        System.out.println("Deryption code " + new String(cipher.decode_message));

        String message = "Hello";
        String coded = cipher.encrpyt_message(message);
        System.out.println("encrypted code: " + coded);
        System.out.println("message " + cipher.decrpyt_message(coded));
    }
}
