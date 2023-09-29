package at.david.projects;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int dicePlayer = random.nextInt(1,7);
        int diceComputer = random.nextInt(1,7);

        Scanner scanner = new Scanner(System.in);

        int PunktestandPlayer = 0;
        int PunktestandComputer = 0;
        boolean gameIsFinished = true;

        System.out.println("Sie haben 6 Würfe. Wenn die Augensumme Ihrer Würfe höher, als die des Computers ist, haben Sie gewonnen!");
        System.out.println("Drücke Sie die Taste: 1, um zu würfeln");

        while(!gameIsFinished){

            int number = scanner.nextInt();

            if (number == 1){
                for (int i = 0; i<=6; i++){
                    PunktestandPlayer = PunktestandPlayer + dicePlayer;
                    PunktestandComputer = PunktestandComputer + diceComputer;

                    System.out.println("Sie haben: " + PunktestandPlayer + " gewürfelt");
                    System.out.println("Der Computer hat: " + PunktestandComputer + " gewürfelt");
                }
            }
        }

        while(gameIsFinished){
            if (PunktestandPlayer > PunktestandComputer){
                System.out.println("Sie haben " + PunktestandPlayer + " zu" + PunktestandComputer + " gewonnen");
            } else if (PunktestandComputer > PunktestandPlayer){
                System.out.println("Sie haben" + PunktestandPlayer + " zu" + PunktestandComputer + " verloren");
            }
        }
    }
}
