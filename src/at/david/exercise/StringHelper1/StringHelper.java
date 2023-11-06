package at.david.exercise.StringHelper1;

public class StringHelper {
    public static boolean isPalindrome(String input) {
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(length - i - 1))) {
                return false;
            }
        }

        return true;
    }

    public static int countLetters(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isLetter(character)) {
                count++;
            }
        }

        return count;
    }

    public static String reverseString(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }

    public static void printAmountOfLetters(String input) {
        int[] letterCount = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char character = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(character)) {
                letterCount[character - 'a']++;
            }
        }

        for (int i = 0; i < letterCount.length; i++) {
            char letter = (char) ('a' + i);
            int amount = letterCount[i];
            if (amount > 0) {
                System.out.println(letter + ": " + amount);
            }
        }
    }


}
