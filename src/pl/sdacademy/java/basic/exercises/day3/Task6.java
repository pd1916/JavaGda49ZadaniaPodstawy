package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    public static void main(String[] args) {
        String correctEmailAddress = "aaa@com.pl";
        String inCorrectEmailAddress = "aaa";
        System.out.println(correctEmailAddress + " " + isCorrectEmailFormat(correctEmailAddress));
        System.out.println(inCorrectEmailAddress + " " + isCorrectEmailFormat(inCorrectEmailAddress));
    }

    private static boolean isCorrectEmailFormat(String emailAddress) {
        // + -> jeden lub wiele znaków
        // * -> zero lub wiele znaków
        // ? -> zero lub jeden znak
        String regex = "[A-Za-z0-9_.-]+\\@[a-z]+\\.[a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
