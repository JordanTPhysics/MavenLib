package company;

public abstract class DVD extends LibraryItems implements age_rating {



    //Attributes



    //Constructor
    protected DVD(String name, int releaseYr, int age_rating, String genre) {
        super(name, releaseYr, genre);

    }

    @Override
   public void age_rating() {

    }
    //Methods
}
