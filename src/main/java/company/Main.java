package company;

public abstract class Main implements Genre {

    public Main(String name, int release_yr, String genre) {
    }

    public Main() {
    }

    public static void main(String[] args) {
        String[] Genres = {"Action", "Comedy", "Drama", "Adventure"};
    }

    Book CIA = new Book("Cows in Action", 2009, 128, false, "Steve Cole", "Comedy");


}