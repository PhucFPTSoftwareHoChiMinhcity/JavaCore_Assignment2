package Baitap2;
public class Book {
    // attributes: title: tieu de sach;author:tac gia;price:gia sach;quantityInStock:so luong sach trong kho
    private String title;
    private Author author;
    private double price;
    private int quantityInStock;
    // constructor k tham so
    public Book() {
    }

    // constructor co tham so
    public Book(String title, Author author, double price, int quantityInStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // displaybook
    public void displaybook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("quantityInStock: " + quantityInStock);
    }

    // toString
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
    // getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    // tao ham calculatePrice()
    public double calculatePrice() {

        return price;
    }
}

