import company.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
   public void testBookNameMethod(){
Book TB = new Book("Tracy Beaker",1991,152,false,"Jacqueline Wilson","Drama");
assertEquals("Book name is incorrect","Tracy Beaker",TB.getName());
    }
}
