package at.david.projects;

import java.util.Scanner;

public class Caeser_Cipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g","h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s","t", "u", "v", "w", "x", "y", "z"};
        int shift = 5;

        String word = "David";
        String word_encrypted = encrypt(word, alphabet, 2);
        String word_decrypted = decrypt(word, alphabet, -2);




        System.out.println("Das normale Wort ist: " + word);
        System.out.println("Das verschlüsselte Wort ist: " + word_encrypted);
        System.out.println("Das entschlüsselte Wort ist: " + word_decrypted);

    }

    public static String encrypt(String word, String[] alphabet, int shift){

    }

    public static String decrypt(String word, String[] alphabet, int shift){

    }
}
