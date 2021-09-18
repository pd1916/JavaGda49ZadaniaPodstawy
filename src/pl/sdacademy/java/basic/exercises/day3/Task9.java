package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task9 {

    public static void main(String[] args) {
        System.out.println(isContainsAString("a Psik"));
        System.out.println(isContainsAString("a psik"));
        System.out.println(isContainsAString("aaa psik"));
        System.out.println(isContainsAString("aaapsik"));
        System.out.println(isContainsAString("psik"));
        System.out.println(isContainsAString(" psik"));
    }

    private static boolean isContainsAString(String input) {
        String regex = "a+ psik";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}
