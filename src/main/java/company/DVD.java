package company;

public class DVD extends LibraryItems implements AgeRating, length {



    //Attributes



    //Constructor
    protected DVD(String name, int releaseYr, int AgeRating, String genre) {
        super(name, releaseYr, genre);

    }
    public String toString(){return "\r\n name: " + this.name +"\r\n Release year: "
            + this.releaseYr +"\r\n Age rating: " + AgeRating() + "\r\n Genre: " + this.genre; }

    //Methods
    @Override
    public int AgeRating() {return 0;
    }

    @Override
    public double length() {
        return 0;
    }
}


