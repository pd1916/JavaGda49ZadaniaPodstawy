package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {

    public static void main(String[] args) {
        //System.out.println(getLastCharacterFromStringV1(null));
        //System.out.println((null));
        lastCharacter(null);
//        System.out.println(getLastCharacterFromStringV1(" "));
//        System.out.println(getLastCharacterFromStringV1("     "));
//        System.out.println(getLastCharacterFromStringV1("   ala  "));
    }

    private static char getLastCharacterFromStringV1(String input) {
        if(input == null || input.isBlank()) {
            System.exit(-1);
        }
        input = input.trim();
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }

    private static String getLastCharacterFromStringV2(String input) {
        if(input == null || input.isBlank()) {
            System.exit(-1);
        }
        input = input.trim();
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }

    private static void lastCharacter (String word){
        word = word.trim();
        if(word.length() == 0){
            System.out.println("Your string is null or have only white chars");
            System.exit(1);
        }

        System.out.print(word.charAt(word.length()-1));
    }
}
