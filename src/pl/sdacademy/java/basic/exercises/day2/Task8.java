package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println(replaceChars("Ala ma Kota!"));
        System.out.println(invertCase("Ala ma Kota!"));
    }

    private static String replaceChars(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                result.append((char)(currentChar + DIFF_UPPER_AND_LOWER));
            } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                result.append((char)(currentChar - DIFF_UPPER_AND_LOWER));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    static String invertCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(Character.isUpperCase(c) ?
                    Character.toLowerCase(c) :
                    Character.toUpperCase(c));
        }
        return sb.toString();
    }
}
