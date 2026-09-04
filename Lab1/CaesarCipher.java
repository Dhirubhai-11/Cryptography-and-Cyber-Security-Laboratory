
public class CaesarCipher {

    public static String encode(String enc, int offset) {

        offset = offset % 26 + 26;

        StringBuilder encoded = new StringBuilder();

        for (char ch : enc.toCharArray()) {

            if (Character.isLetter(ch)) {

                if (Character.isUpperCase(ch)) {
                    encoded.append(
                        (char) ('A' + (ch - 'A' + offset) % 26)
                    );
                } 
                else {
                    encoded.append(
                        (char) ('a' + (ch - 'a' + offset) % 26)
                    );
                }

            } 
            else {
                encoded.append(ch);
            }
        }

        return encoded.toString();
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static void main(String[] args) {

        String msg = "Anna University";

        System.out.println("Simulating Caesar Cipher");
        System.out.println("-----------------------");

        System.out.println("Input : " + msg);

        String encrypted = encode(msg, 3);
        System.out.println("Encrypted Message : " + encrypted);

        String decrypted = decode(encrypted, 3);
        System.out.println("Decrypted Message : " + decrypted);
    }
}

