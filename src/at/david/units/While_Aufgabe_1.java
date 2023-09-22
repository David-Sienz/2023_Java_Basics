//22.09.2023 - Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen. Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
package at.david.units;

import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {
        int sum = 0;

        Random random = new Random();
        boolean isFinshed = false;

        while(!isFinshed){
            int randomValue = random.nextInt(10, 30);
            sum += randomValue;

            if (randomValue == 15 || randomValue == 25){
                isFinshed = true;
            }

        }
        System.out.println(sum);
    }
}
