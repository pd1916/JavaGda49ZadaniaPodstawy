package pl.sdacademy.java.basic.exercises.day2.day2;

public class Task11 {

    public static void main(String[] args) {
        String input = "kayak";
        String result = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(result));
    }
}
