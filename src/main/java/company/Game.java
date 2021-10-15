package company;

public abstract class Game extends LibraryItems{
    public Game(String name, int release_yr, int age_rating, String genre) {
        super(name, release_yr, genre);
    }
}
