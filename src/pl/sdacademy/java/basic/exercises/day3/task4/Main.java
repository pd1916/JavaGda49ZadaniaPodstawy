package pl.sdacademy.java.basic.exercises.day3.task4;

import pl.sdacademy.java.basic.exercises.day3.task4.Computer.Processor;

import static pl.sdacademy.java.basic.exercises.day3.task4.Computer.*;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(10, "Intel");
        Memory memory = new Memory(8192, "Lenovo", "SSD");
        ExternalPort externalPort = new ExternalPort("USB");
        Computer computer = new Computer(processor, memory, externalPort);
        System.out.println(computer.toString());
    }
}
