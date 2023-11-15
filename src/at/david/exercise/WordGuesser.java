package at.david.exercise;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean gameIsRunning = true;
        String[] words = {"java", "english", "german", "basketball", "counter", "strike"};
        String secretWord = "";
        String currentGuess = "";

        WordGuesser wordGuesser = new WordGuesser();
        wordGuesser.showMenu(random, scanner, gameIsRunning, words, secretWord, currentGuess);
    }

    private void showMenu(Random random, Scanner scanner, boolean gameIsRunning, String[] words, String secretWord, String currentGuess) {
        System.out.println("Willkommen beim Wortraten-Spiel!");
        System.out.println("1. Neues Spiel starten");
        System.out.println("2. Spiel beenden");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                startGame(random, scanner, gameIsRunning, words, secretWord, currentGuess);
                break;
            case 2:
                System.out.println("Auf Wiedersehen!");
                gameIsRunning = false;
                break;
            default:
                System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");
                showMenu(random, scanner, gameIsRunning, words, secretWord, currentGuess);
        }
    }

    private void startGame(Random random, Scanner scanner, boolean gameIsRunning, String[] words, String secretWord, String currentGuess) {

    }
}
