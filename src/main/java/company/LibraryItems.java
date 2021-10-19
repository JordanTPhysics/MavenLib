package company;

public abstract class LibraryItems<name> extends Main {
//Attributes
public String name;
public int releaseYr;
public String genre;




 //Constructor
    public LibraryItems(String name, int releaseYr, String genre) {

        this.name = name;
        this.releaseYr = releaseYr;
        this.genre = genre;

    }
    public String getName(){return name;}
    public int getReleaseYr(){return releaseYr;}
    public String getGenre(){return genre;}


    public void setName(String name) {
        this.name = name;
    }
    public void setReleaseYr(int releaseYr) {this.releaseYr = releaseYr;}
    public void setGenre(String genre) {
        this.genre = genre;
    }


    //Methods


}

