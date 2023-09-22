//22.09.2023 - Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
package at.david.units;

public class Loops_Aufgabe_2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i<=1000; i = i+2){
            sum += i;
        }


        System.out.println(sum);

    }
}