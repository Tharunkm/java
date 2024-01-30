package lab_practice;
import lab_practice.P17_Author;

public class P17_Book {
	private String name;
    private P17_Author author;
    private double price;
    private int qtyInStock;

    public P17_Book(String name, P17_Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getter and Setter methods for Book class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public P17_Author getAuthor() {
        return author;
    }

    public void setAuthor(P17_Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

}
