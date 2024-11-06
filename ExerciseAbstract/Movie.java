package ExerciseAbstract;

public class Movie extends Product{

    private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director=director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double discount = (super.getPrice()*10)/100;
        setPrice(getPrice()-discount);
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Movie name : "+getName()+"\nMovie price : "+getPrice()+"\nDirector : "+getDirector();
    }
}
