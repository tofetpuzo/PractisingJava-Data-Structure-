package PractiseJavaDataStructure;

public class practiseCipher {

    protected char[] encode_message = new char[26];
    protected char[] decode_message = new char[26];

    public practiseCipher(int rotation) {

        for (int i = 0; i < 26; i++) {
            encode_message[i] = (char) ('A' + (i + rotation) % 26);
            decode_message[i] = (char) ('A' + (i - rotation + 26) % 26);
        }
    }

    public String decrypt(String mesg) {
        return transform(mesg, decode_message);
    }

    public String encrypt(String mesg) {
        return transform(mesg, encode_message);
    }

    private String transform(String message, char[] decode_message2) {
        char[] msg = message.toCharArray();
        for (int j = 0; j < msg.length; j++) {
            if (Character.isUpperCase(msg[j])) {
                int i = msg[j] - 'A';
                msg[j] = decode_message2[i];
            }
        }
        return new String(msg);
    }

    public static void main(String[] args) {
        practiseCipher ciphers = new practiseCipher(3);
        System.out.println("Encryoted code:" + new String(ciphers.encode_message));
        System.out.println("Decrypted code:" + new String(ciphers.encode_message));
        String message = "Today is a good day";
        System.out.println("Encrypted message" + ciphers.encrypt(message));
        String coded = ciphers.encrypt(message);
        System.out.println("New message" + ciphers.decrypt(coded));
    }
}
