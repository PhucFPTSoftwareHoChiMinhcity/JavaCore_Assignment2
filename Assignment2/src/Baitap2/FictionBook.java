package Baitap2;
public class FictionBook extends Book{
    // attributes: genre
    private String genre;
    // constructor k tham so
    public FictionBook() {
    }
    // constructor co tham so

    public FictionBook(String genre) {
        this.genre = genre;
    }

    public FictionBook(String title, String author, double price, int quantityInStock, String genre) {
        super(title, author, price, quantityInStock);
        this.genre = genre;
    }

    // void displayfictionBook
    void displayfictionBook()
    {

        System.out.println("Genre: " + genre);
    }
}

