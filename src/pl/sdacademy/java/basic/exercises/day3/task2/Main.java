package pl.sdacademy.java.basic.exercises.day3.task2;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Tuwim" , "PL");
        Author author2 = new Author("Chotomska" , "PL");
        Author author3 = new Author("King" , "US");

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(author1, 25);
        poems[1] = new Poem(author2, 120);
        poems[2] = new Poem(author3, 75);

        System.out.println(getSurnameWithMaxStropheNumbers(poems));
        System.out.println(getSurnameWithMaxStropheNumbersV2(poems));
    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int maxStropheNumbers = 0;
        String author = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(maxStropheNumbers < currentStropheNumbers) {
                maxStropheNumbers = currentStropheNumbers;
//                Author creator = poem.getCreator();
//                String surname = creator.getSurname();
                author = poem.getCreator().getSurname();
            }
        }
        return author;
    }

    private static Author getSurnameWithMaxStropheNumbersV2(Poem[] poems) {
        int maxStropheNumbers = 0;
        Author author = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumbers();
            if(maxStropheNumbers < currentStropheNumbers) {
                maxStropheNumbers = currentStropheNumbers;
//                Author creator = poem.getCreator();
//                String surname = creator.getSurname();
                author = poem.getCreator();
            }
        }
        return author;
    }
}
