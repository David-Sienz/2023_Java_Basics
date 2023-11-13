package at.david.exercise;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean gameIsRunning = true;
    private String[] words = {"java", "english", "german", "basketball", "counter", "strike"};
    private String secretWord;
    private String currentGuess;

    public static void main(String[] args) {
        WordGuesser wordGuesser = new WordGuesser();
        wordGuesser.showMenu();
    }

    private void showMenu() {
        System.out.println("Willkommen beim Wortraten-Spiel!");
        System.out.println("1. Neues Spiel starten");
        System.out.println("2. Spiel beenden");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                startGame();
                break;
            case 2:
                System.out.println("Auf Wiedersehen!");
                gameIsRunning = false;
                break;
            default:
                System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");
                showMenu();
        }
    }

    private void startGame() {

    }
}
