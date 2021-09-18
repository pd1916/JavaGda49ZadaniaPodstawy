package pl.sdacademy.java.basic.exercises.day3.Task2;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
