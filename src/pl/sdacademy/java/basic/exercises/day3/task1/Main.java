package pl.sdacademy.java.basic.exercises.day3.task1;

public class Main {

    public static void main(String[] args) {
        //int[] array = new int[5];
        Cat cat1 = new Cat("Mruczek");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(6);

        System.out.println();

        Cat cat2 = new Cat("Filemon");
        cat2.print();
        cat2.makeSound();
        cat2.eatMice(12);

        System.out.println();

        Cat cat3 = new Cat("Bonifacy");
        cat3.print();
        cat3.makeSound();
        cat3.eatMice(20);

        cat1.setName("Rudy");
        System.out.println("Nowe imie dla cat1: " + cat1.getName());

//        Cat[] cats = new Cat[3];
//        Cat[] cats = {...};
    }
}
