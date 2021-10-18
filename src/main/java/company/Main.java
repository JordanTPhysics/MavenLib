package company;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public Main(String name, int release_yr, String genre) {
    }

    public Main() {
    }

    public static void main(String[] args) {


        String[] Genres = {"Action", "Comedy", "Drama", "Adventure"};
        Book CIA = new Book("Cows in Action", 2009, 128, false, "Steve Cole", "Comedy");

        Book HarryPotter1 = new Book("Harry Potter I ",1997,224,true,"J.K.Rowling","Adventure");
        Book Bible = new Book("The Holy Bible",1,666,true,"Everyone","Adventure");
        System.out.println(Bible);
        System.out.println(HarryPotter1);
        System.out.println(CIA);
        Audiobook Ocean = new Audiobook("Ocean sounds",2018,"Relax");
        List<Object> Books = new ArrayList<Object>();
        Books.add(HarryPotter1);
        Books.add(Bible);
        Books.add(CIA);
        System.out.println(Books);


    }




}