package at.david.exercise.StringHelper1;

public class StringHelper {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static int countLetters(String input, char input_char) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input_char) {
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

    public static void printAmountOfLetters(String input){

    }


}
