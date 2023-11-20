package at.david.exercise.WordGuesser;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean gameIsRunning = true;
        String[] words = {"java", "english", "german", "basketball", "counter", "strike"};

        while (gameIsRunning) {
            String secretWord = words[random.nextInt(words.length)];
            playGame(scanner, secretWord);

            System.out.println("Möchten Sie nochmal spielen? (ja/nein)");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("ja")) {
                gameIsRunning = false;
            }
        }

        System.out.println("Auf Wiedersehen!");
        scanner.close();
    }

    public static void playGame(Scanner scanner, String secretWord) {
        StringBuilder currentGuess = new StringBuilder(initializeCurrentGuess(secretWord.length()));

        while (true) {
            System.out.println("Aktueller Zustand: " + currentGuess);

            char guess = getGuess(scanner);
            if (!updateCurrentGuess(secretWord, currentGuess, guess)) {
                System.out.println("Falscher Buchstabe!");
            }

            if (currentGuess.toString().equals(secretWord)) {
                System.out.println("Herzlichen Glückwunsch! Sie haben das Wort geraten: " + secretWord);
                break;
            }
        }
    }

    public static String initializeCurrentGuess(int length) {
        StringBuilder guess = new StringBuilder();
        for (int i = 0; i < length; i++) {
            guess.append("_");
        }
        return guess.toString();
    }

    public static char getGuess(Scanner scanner) {
        System.out.println("Geben Sie einen Buchstaben ein: ");
        return scanner.next().charAt(0);
    }

    public static boolean updateCurrentGuess(String secretWord, StringBuilder currentGuess, char guess) {
        boolean isGuessCorrect = false;

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                isGuessCorrect = true;
            }
        }

        return isGuessCorrect;
    }


}

