package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date in format [yyyy-MM-dd HH:mm:ss]");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays(); // +1
        System.out.println("You have " + days + " days to the next lesson");
    }
}
