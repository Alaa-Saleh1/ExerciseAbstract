package ExerciseAbstract;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("book_test1",100,"Alaa");

        Book book2 = new Book("book_test2",45,"alaa");

        System.out.println("#Book#");
        System.out.println(book1.toString());
        System.out.println("Price with 15% discount : "+book1.getDiscount());
        System.out.println("________________________");
        System.out.println(book2.toString());
        System.out.println("Price with 15% discount : "+book2.getDiscount());

        Movie movie1 = new Movie("Movie_test1",78,"alaa");
        Movie movie2 = new Movie("Movie_test2",38,"alaa");


        System.out.println("\n#Movies#");
        System.out.println(movie1.toString());
        System.out.println("Price with 10% discount : "+movie1.getDiscount());
        System.out.println("________________________");
        System.out.println(movie2.toString());
        System.out.println("Price with 10% discount : "+movie2.getDiscount());

    }
}