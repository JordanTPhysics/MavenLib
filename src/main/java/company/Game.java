package company;

public class Game extends LibraryItems implements AgeRating {


    @Override
    public int AgeRating() {
        return 0;
    }

    protected Game(String name, int releaseYr, int AgeRating, String genre) {
        super(name, releaseYr, genre);


    }
public String toString(){return "\r\n name: " + this.name +"\r\n Release year: "
        + this.releaseYr +"\r\n Age rating: " + AgeRating() + "\r\n Genre: " + this.genre; }




    public void setAgeRating(int AgeRating) {
    }
    public int getAgeRating(){return AgeRating();};


}
