package Baitap2;
import java.util.ArrayList;
import java.util.List;
public class BookTest {
    public static void main(String[] args) {
        // tao doi tuong cho BookManager
        BookManager bookManager = new BookManager();
        List<Book> books = new ArrayList<>();
        // tao doi tuong va truyen du lieu cho Author
        Author author = new Author(1, "J.K.Rowling");
        // tao doi tuong va truyen du lieu cho Book
        Book book = new Book("Comic", author, 12, 25);
        // Add List to Book data
        books.add(new Book());
        // tao doi tuong va truyen du lieu cho ChildrensBook
        ChildrensBook childrensBook = new ChildrensBook(24);
        // tao doi tuong va truyen du lieu cho ScienceBook
        ScienceBook scienceBook = new ScienceBook("Comic");
        // tao doi tuong va truyen du lieu cho FictionBook
        FictionBook fictionBook = new FictionBook("Cartoon NetWork");
        // output
        System.out.printf("Author: \nID:%d \nName:%s", author.getId(), author.getName());
        System.out.printf("\nBook: \nTitle:%s \nAuthor:%s \nPrice:%f \nquantityInStock:%d", book.getTitle(), author.displayAuthorBookCount(), book.getPrice(), book.getQuantityInStock());
        // goi phuong thuc countBooksByAuthor tu class BookManager
        BookManager.countBooksByAuthor(books);
        // xuat countBooksByAuthor
        System.out.printf("\ncountBooksByAuthor: ", BookManager.countBooksByAuthor(books));
    }
}

