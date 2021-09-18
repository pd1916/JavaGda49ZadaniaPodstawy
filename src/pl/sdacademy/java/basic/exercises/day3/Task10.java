package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        timer();
    }

    private static void timer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To start timing press ENTER");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();

        System.out.println("To stop timing press ENTER");
        scanner.nextLine();
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Total time " + duration.toSeconds() + " sec");
    }
}
