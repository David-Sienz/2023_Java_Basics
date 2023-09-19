package at.david.units;

import java.util.Random;

public class If_Statement_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);


        if (randomNumber<20){
            System.out.println("Mini");
        }

        else if ((randomNumber>20) && (randomNumber<50)){
            System.out.println("Medium");
        }

        else {
            System.out.println("Large");
        }
    }
}
