package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String correctFormatNumber1 = "1234";
        String correctFormatNumber2 = "1234,12";
        String correctFormatNumber3 = "-1234,12";
        String correctFormatNumber4 = "-1234";
        String inCorrectFormatNumber1 = "--1234";
        String inCorrectFormatNumber2 = "1234.12";
        String inCorrectFormatNumber3 = "1234 12";
        String inCorrectFormatNumber4 = ",12";
        String inCorrectFormatNumber5 = "-,";

        System.out.println(correctFormatNumber1 + " " + isCorrectNumberFormat(correctFormatNumber1));
        System.out.println(correctFormatNumber2 + " " + isCorrectNumberFormat(correctFormatNumber2));
        System.out.println(correctFormatNumber3 + " " + isCorrectNumberFormat(correctFormatNumber3));
        System.out.println(correctFormatNumber4 + " " + isCorrectNumberFormat(correctFormatNumber4));
        System.out.println(inCorrectFormatNumber1 + " " + isCorrectNumberFormat(inCorrectFormatNumber1));
        System.out.println(inCorrectFormatNumber2 + " " + isCorrectNumberFormat(inCorrectFormatNumber2));
        System.out.println(inCorrectFormatNumber3 + " " + isCorrectNumberFormat(inCorrectFormatNumber3));
        System.out.println(inCorrectFormatNumber4 + " " + isCorrectNumberFormat(inCorrectFormatNumber4));
        System.out.println(inCorrectFormatNumber5 + " " + isCorrectNumberFormat(inCorrectFormatNumber5));
    }

    private static boolean isCorrectNumberFormat(String number) {
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(number).matches();
    }
}
