
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.No;
import static org.junit.Assert.assertEquals;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(plugin = {"pretty"})

public class CucumberTest {
    static String HarryPotter(String reading) {
        return "Harry Potter".equals(reading) ? "yes!" : "no";

    }

}
class BookyTest{

    private String reading;
    private String Answer;
    @Given("Reading BFG")
    public void Reading_BFG(){
        reading = "BFG";
    }
    @Given("Reading Harry Potter")
    public void Reading_Harry_Potter(){
        reading = "Harry Potter";
    }
    @When("is Harry Potter?")
    public void isHarryPotter(){Answer = CucumberTest.HarryPotter(reading);};
    @Then("Answer is")
    public void AnswerIs(String ExpectedAnswer){
        assertEquals(ExpectedAnswer,Answer);
    }

}