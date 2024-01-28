package Baitap2;
public class ScienceBook extends Book{
    private String field;
    // constructor k tham so
    public ScienceBook() {
    }
    // constructor co tham so

    public ScienceBook(String field) {
        this.field = field;
    }

    public ScienceBook(String title, Author author, double price, int quantityInStock, String field) {
        super(title, author, price, quantityInStock);
        this.field = field;
    }

    // viet phuong thuc displayAuthorBookCount() hien thi so luong sach moi tac gia, co the use HashMap
    // void displayscienceBook
    void displayscienceBook()
    {

        System.out.println("Field: " + field);
    }
}

