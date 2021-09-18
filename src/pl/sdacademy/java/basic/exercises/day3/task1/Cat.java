package pl.sdacademy.java.basic.exercises.day3.task1;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Miau Miau");
    }

    public void eatMice(int mice) {
        System.out.println("I ate " + mice + " mice");
    }

    public void print() {
//        String description = "Cat: \nname=" + name;
//        System.out.println(description);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }


}
