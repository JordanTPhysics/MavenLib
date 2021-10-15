package company;

public class Book extends LibraryItems implements Author{ //declare class book
    //Attributes
     private int pages;
     private boolean hardcopy;
     private String Author ;


     //Constructor

    public Book(String name, int release_yr, int pages, boolean hardcopy, String Author, String genre){
        super (name, release_yr, genre);
        this.pages = pages;
        this.hardcopy = hardcopy;
        this.Author = Author;



    }
public String toString() {
        return "This book has" + this.pages + "pages, written by" + this.Author + "and is" + this.hardcopy;
}
public String getAuthor(){
        return Author;
}
public int getpages(){
        return pages;
}
public boolean gethardcopy(){
        return hardcopy;
}

    public void setAuthor(String author) {
        Author = author;
    }

    public void setpages(int pages) {
        this.pages = pages;
    }

    public void sethardcopy(boolean hardcopy) {
        this.hardcopy = hardcopy;
    }
}



    //Methods


