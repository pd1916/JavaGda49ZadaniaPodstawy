package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {
    public static void main(String[] args) {
        int maxRange = 10;
        for(int i = 0; i <= maxRange; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
