package at.david.projects;

import java.util.Scanner;

public class Bankomat_Beispiel {

    public static void main(String[] args) {

        System.out.println("Selektieren Sie die gewünschte Funktion:");
        System.out.println("   1. Einzahlen");
        System.out.println("   2. Abheben");
        System.out.println("   3. Kontostand");
        System.out.println("   4. Ende");



        Scanner scanner = new Scanner(System.in);
        int Kontostand = 0;
        boolean isRunning = true;


        while(isRunning){

            int number = scanner.nextInt();

            if (number == 1){
                System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten:");
                number = scanner.nextInt();

                Kontostand = Kontostand + number;
                System.out.println("Sie haben " + Kontostand + " Euro eingezahlt.");
            }

            if (number == 2){
                System.out.println("Wie viel Geld wollen Sie abheben?");
                number = scanner.nextInt();

                Kontostand = Kontostand - number;
                System.out.println("Sie haben " + Kontostand + " Euro abgehoben");
            }

            if (number == 3){
                System.out.println("Ihr Kontostand beträgt: " + Kontostand + " Euro");
            }

            if (number == 4){
                System.out.println("Maschine stoppt!");
                isRunning = false;
            }

        }
    }
}
