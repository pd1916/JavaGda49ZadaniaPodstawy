package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(countCharInStringV2("Ala ma kota", 'a'));
        System.out.println(countCharInStringV2("", 'a'));
        System.out.println(countCharInStringV2(" ", 'a'));
        //System.out.println(countCharInStringV2(null, 'a'));
    }

    private static int countCharInString(String input, char sign) {
        int counter = 0;
        if(input != null && !input.isBlank()) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == sign) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int countCharInStringV2(String input, char sign) {
        int counter = 0;
        char[] letters = input.toCharArray();
        for(char c : letters) {
            if(c == sign) {
                counter++;
            }
        }
        return counter;
    }
}
