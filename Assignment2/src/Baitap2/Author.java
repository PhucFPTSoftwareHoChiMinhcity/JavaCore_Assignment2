package Baitap2;

public class Author {
    // attributes: id: ma tac gia; name: ten tac gia
    private int id;
    private String name;

    // constructor k tham so
    public Author() {
    }

    // constructor co tham so
    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // displayauthor
    public void displayauthor() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    // toString

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // tao ham displayAuthorBookCount()
    public String displayAuthorBookCount()
    {
        return name;
    }
}

