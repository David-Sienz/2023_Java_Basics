package at.david.projects.CaesarCipher;

public class CaesarCipherDecrypt {
    public static String decrypt(String data, int shift) {
        StringBuilder decryptedWord = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char currentChar = data.charAt(i);
            char decryptedChar = (char) (currentChar - shift);
            decryptedWord.append(decryptedChar);
        }

        return decryptedWord.toString();
    }
}
