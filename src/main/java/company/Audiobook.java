package company;

public abstract class Audiobook extends LibraryItems implements Author {
    public Audiobook(String name, int release_yr,String genre) {
        super(name, release_yr, genre);

    }
}
