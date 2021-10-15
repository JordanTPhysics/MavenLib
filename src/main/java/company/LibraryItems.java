package company;

public abstract class LibraryItems<name> extends Main {
//Attributes
public String name;
public int release_yr;
public String genre;




 //Constructor
    public LibraryItems(String name, int release_yr, String genre) {

        this.name = name;
        this.release_yr = release_yr;
        this.genre = this.genre;
    }
    public String getName(){return name;}
    public int getRelease_yr(){return release_yr;}
    public String getGenre(){return  genre;}

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_yr(int release_yr) {
        this.release_yr = release_yr;

    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    //Methods
}

