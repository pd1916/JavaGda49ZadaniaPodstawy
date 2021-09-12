package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {

    public static void main(String[] args) {
        replaceAndDisplayString("Ala,ma.kota i psa");
    }

    private static void replaceAndDisplayString(String input) {
        String result = input
                .replace(",", "-STOP-")
                .replace(".", "-STOP-")
                .replace(" ", "-STOP-");
        System.out.println(result);
    }
}
