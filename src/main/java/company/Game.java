package company;

public abstract class Game extends LibraryItems implements age_rating{
    public Game(String name, int release_yr, int age_rating, String genre) {
        super(name, release_yr, genre);
    this.age_rating = age_rating;
    }

}
