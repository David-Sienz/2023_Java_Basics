package at.david.projects;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean gameIsRunning = true;


        while (gameIsRunning) {
            int pointsPlayer = 0;
            int pointsComputer = 0;

            System.out.println("Sie haben 6 Würfe. Wenn die Augensumme Ihrer Würfe höher ist als die des Computers, haben Sie gewonnen!");
            System.out.println("Drücken Sie die Taste: 1, um zu würfeln");

            for (int i = 1; i <= 6; i++) {
                int input = scanner.nextInt();

                if (input == 1) {
                    int dicePlayer = random.nextInt(1, 7);
                    int diceComputer = random.nextInt(1, 7);

                    pointsPlayer += dicePlayer;
                    pointsComputer += diceComputer;

                    System.out.println("Sie haben: " + dicePlayer + " geworfen!");
                    System.out.println("Der Computer hat: " + diceComputer + " geworfen!");
                }
            }

            System.out.println(" ");  //Um einen Zeilenabstand zu erstellen

            if (pointsPlayer > pointsComputer) {
                System.out.println("Sie haben " + pointsPlayer + " zu " + pointsComputer + " gewonnen!");
            } else if (pointsComputer > pointsPlayer) {
                System.out.println("Sie haben " + pointsPlayer + " zu " + pointsComputer + " verloren!");
            } else {
                System.out.println("Unentschieden!");
            }

            gameIsRunning = false;
        }

        scanner.close();
    }
}
