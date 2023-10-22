package at.david.projects.CaesarCipher;

public class CaesarCipherMain {
    public static void main(String[] args) {
        String data = "david123!";
        int shift = 3;

        System.out.println("Das Wort, welches verschlüsselt werden soll ist: " + data);
        System.out.println("---------------------------------------------------------");

        String encryptedData = CaesarCipherEncrypt.encrypt(data, shift);
        System.out.println("Das verschlüsselte Wort ist: " + encryptedData);
        System.out.println("---------------------------------------------------------");

        String decryptedData = CaesarCipherDecrypt.decrypt(encryptedData, shift);
        System.out.println("Das entschlüsselte Wort ist: " + decryptedData);
    }

}