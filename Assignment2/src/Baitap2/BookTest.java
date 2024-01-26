package Baitap2;
public class BookTest {
    public static void main(String[] args) {
        // tao doi tuong va truyen du lieu cho Author
        Author author = new Author(1, "J.K.Rowling");
//        Author author1 = new Author(2, "Fujiko");
//        Author author2 = new Author(3, "Arthur Conan Doyle");
        // tao doi tuong va truyen du lieu cho ChildrensBook
        ChildrensBook childrensBook = new ChildrensBook("Movie", "J.K.Rowling", 15, 20, 101);
//        ChildrensBook childrensBook1 = new ChildrensBook("Comic", "Fujiko", 25, 30, 102);
//        ChildrensBook childrensBook2 = new ChildrensBook("Movie and Comic", "Arthur Conan Doyle", 30, 40, 103);
        // tao doi tuong va truyen du lieu cho ScienceBook
        ScienceBook scienceBook = new ScienceBook("Movie", "J.K.Rowling", 35, 45, "a");
//        ScienceBook scienceBook1 = new ScienceBook("Comic", "Fujiko", 50, 55, "b");
//        ScienceBook scienceBook2 = new ScienceBook("Movie and Comic", "Arthur Conan Doyle", 60, 65, "c");
        // tao doi tuong va truyen du lieu cho FictionBook
        FictionBook fictionBook = new FictionBook("Movie", "J.K.Rowling", 70, 75, "Witch");
//        FictionBook fictionBook1 = new FictionBook("Comic", "Fujiko", 80, 85, "Science");
//        FictionBook fictionBook2 = new FictionBook("Movie and Comic", "Arthur Conan Doyle", 90, 95, "Detective");
        // output author
        System.out.printf("Author: \nID:%d \nName:%s", author.getId(), author.getName());
//        System.out.printf("\nAuthor1: \nID:%d \nName:%s", author1.getId(), author1.getName());
//        System.out.printf("\nAuthor2: \nID:%d \nName:%s", author2.getId(), author2.getName());
        // output ChildrenBook
        System.out.printf("\nChildrenBook \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d ", childrensBook.getTitle(), childrensBook.getAuthor(), childrensBook.getPrice(), childrensBook.getQuantityInStock());
//        System.out.printf("\nChildrenBook1 \nTitle:%s \nAuthor:%s \nprice:%f \nQuantityInStock:%d", childrensBook1.getTitle(), childrensBook1.getAuthor(), childrensBook1.getPrice(), childrensBook1.getQuantityInStock());
//        System.out.printf("\nChildrenBook2 \ntitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", childrensBook2.getTitle(), childrensBook2.getAuthor(), childrensBook2.getPrice(), childrensBook2.getQuantityInStock());
        // output ScienceBook
        System.out.printf("\nScienceBook \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", scienceBook.getTitle(), scienceBook.getAuthor(), scienceBook.getPrice(), scienceBook.getQuantityInStock());
//        System.out.printf("\nScienceBook1 \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", scienceBook1.getTitle(), scienceBook1.getAuthor(), scienceBook1.getPrice(), scienceBook1.getQuantityInStock());
//        System.out.printf("\nScienceBook2 \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", scienceBook2.getTitle(), scienceBook2.getAuthor(), scienceBook2.getPrice(), scienceBook2.getQuantityInStock());
        // output FictionBook
        System.out.printf("\nFictionBook \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", fictionBook.getTitle(), fictionBook.getAuthor(), fictionBook.getPrice(), fictionBook.getQuantityInStock());
//        System.out.printf("\nFictionBook1 \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", fictionBook.getTitle(), fictionBook.getAuthor(), fictionBook.getPrice(), fictionBook.getQuantityInStock());
//        System.out.printf("\nFictionBook2 \nTitle:%s \nAuthor:%s \nPrice:%f \nQuantityInStock:%d", fictionBook.getTitle(), fictionBook.getAuthor(), fictionBook.getPrice(), fictionBook.getQuantityInStock());

    }
}

