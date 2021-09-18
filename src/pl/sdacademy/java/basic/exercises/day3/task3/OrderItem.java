package pl.sdacademy.java.basic.exercises.day3.task3;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCorrect() {
        return price > 0 && quantity > 0;
    }

    public double getAmount() {
        return quantity * price;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append("\t| ");
        sb.append(price).append(" ").append("zł").append("\t| ");
        sb.append(quantity).append(" ").append("pcs").append("\t| ");
        sb.append(getAmount()).append(" ").append("\t| ");
        System.out.println(sb);
    }
}
