package at.david.projects.CaesarCipher;

public class CaesarCipherEncrypt {

    public static String encrypt(String data, int shift) {
        StringBuilder encryptedWord = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char currentChar = data.charAt(i);
            char encryptedChar = (char) (currentChar + shift);
            encryptedWord.append(encryptedChar);
        }

        return encryptedWord.toString();
    }
}
