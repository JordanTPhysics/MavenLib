package company;




public class Book extends LibraryItems implements Author{




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
        this.genre = genre;



    }
public String toString() {

        return "\r\n Name: " + this.name + "\r\n Pages: " + this.pages + "\r\n Author: " + this.Author + "\r\n Genre: " + this.genre;

    }


public String getAuthor(){

        return Author;
}
public int getpages(){

        return pages;
}
public boolean gethardcopy() {

        return hardcopy;
}

    public void setAuthor(String author) {
        Author = author;
        System.out.println("The Author's name is:"+Author);
    }

    public void setpages(int pages) {
        this.pages = pages;
        System.out.println("The book has"+pages+"pages");
    }

    public void sethardcopy(boolean hardcopy) {
        this.hardcopy = hardcopy;
    }

}






