package Baitap2;
public class ChildrensBook extends Book{
    private int recommendedAge;
    // constructor k tham so
    public ChildrensBook() {
    }
    // constructor co tham so

    public ChildrensBook(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public ChildrensBook(String title, Author author, double price, int quantityInStock, int recommendedAge) {
        super(title, author, price, quantityInStock);
        this.recommendedAge = recommendedAge;
    }

    // viet phuong thuc tinh calculatePrice() de tinh gia ban cua sach, trong do doi voi sach thieu nhi
    // se duoc ap dung giam gia 20%
    @Override
    public double calculatePrice()
    {

        return 0.8 * super.calculatePrice();
    }

    // void displaychildrenBook
    void displaychildrenBook()
    {

        System.out.println("RecommendedAge: " + recommendedAge);
    }
}

