package company;

public abstract class DVD extends LibraryItems {
    public DVD(String name, int release_yr, int age_rating, String genre) {
        super(name, release_yr, genre);
    }
}
