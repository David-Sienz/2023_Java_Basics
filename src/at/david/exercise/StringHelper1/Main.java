package at.david.exercise.StringHelper1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Wort ein: ");
        String text = scanner.nextLine();

        boolean isPalindrome = StringHelper.isPalindrome(text);
        System.out.println("Der Text ist ein Palindrom: " + isPalindrome);

        int countLetters = StringHelper.countLetters(text);
        System.out.println("Die Anzahl der Buchstaben ist: " + countLetters);

        String reverseString = StringHelper.reverseString(text);
        System.out.println("Der Text wird ... rückwerts geschrieben: " + reverseString);

        StringHelper.printAmountOfLetters(text);

        scanner.close();
    }
}
