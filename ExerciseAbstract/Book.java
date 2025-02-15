package ExerciseAbstract;

public class Book extends Product{

    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double discount = (super.getPrice()*15)/100;
        setPrice(getPrice()-discount);
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Book name : "+getName()+"\nBook price : "+getPrice()+"\nAuthor : "+getAuthor();
    }
}
