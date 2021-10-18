package company;

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


    }




}