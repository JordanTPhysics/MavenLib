package company;

public class Audiobook extends LibraryItems implements Author, length {

    //Attributes
double length;


    //Constructor
    public Audiobook(String name, int releaseYr,double length,String genre) {
        super(name, releaseYr, genre);

    }

    @Override
    public double length() {
        return 0;
    }
    //Methods
}
