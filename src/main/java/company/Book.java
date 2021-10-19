package company;




public class Book extends LibraryItems implements Author{




    //Attributes
     private int pages;
     private boolean HardCopy;
     private String Author;




     //Constructor

    public Book(String name, int releaseYr, int pages, boolean HardCopy, String Author, String genre){
        super (name, releaseYr, genre);
        this.pages = pages;
        this.HardCopy = HardCopy;
        this.Author = Author;
        this.genre = genre;



    }
public String toString() {

        return "\r\n Name: " + this.name + "\r\n Pages: " + this.pages + "\r\n Author: " + this.Author +"\r\n Release year: " + this.releaseYr + "\r\n Genre: " + this.genre +
"\r\n HardCopy: " + this.HardCopy;
    }


public String getAuthor(){

        return Author;
}
public int getpages(){

        return pages;
}
public boolean gethardcopy() {

        return HardCopy;
}

    public void setAuthor(String author) {
        this.Author = author;

    }

    public void setpages(int pages) {
        this.pages = pages;

    }

    public void sethardcopy(boolean HardCopy) {
        this.HardCopy = HardCopy;
    }

}






