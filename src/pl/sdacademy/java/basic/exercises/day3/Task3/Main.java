package pl.sdacademy.java.basic.exercises.day3.Task3;

public class Main {

    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier", 1, 3.5);
        OrderItem orderItem2 = new OrderItem("Mąką", 2, 4);
        OrderItem orderItem3 = new OrderItem("Chleb", 3, 4);
        OrderItem orderItem4 = new OrderItem("Jaja", 4, 4);
        OrderItem orderItem5 = new OrderItem("Mleko", 5, 4);
        OrderItem orderItem6 = new OrderItem("Mleko2", 5, 4);
        OrderItem orderItem7 = new OrderItem("Mleko3", 5, 4);

        Order order = new Order(6);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);
        order.addItem(orderItem6);
        order.addItem(orderItem7);

        order.print();
    }
}
