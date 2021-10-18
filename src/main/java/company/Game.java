package company;

public abstract class Game extends LibraryItems implements age_rating{
    protected Game(String name, int releaseYr, int age_rating, String genre) {
        super(name, releaseYr, genre);
    
    }

    @Override
    public void age_rating() {

    }
}
