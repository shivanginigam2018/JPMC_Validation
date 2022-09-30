package stepDefinitions;

import com.qa.pages.GoogleHomepage;
import com.qa.pages.SearchResultPage;
import com.qa.util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {
    private GoogleHomepage ghp = new GoogleHomepage(TestBase.driver);
    private SearchResultPage srp = new SearchResultPage();
    @Given("I have a search field on Google home page")
    public void i_have_a_search_field_on_google_home_page() {
        if(ghp.getSearchKey().isDisplayed()) {
            System.out.println("Search field is displayed");
        }
    }
    @When("I search for keyword {string}")
    public void i_search_for_keyword(String keyword) {
       ghp.getSearchKey().sendKeys(keyword);
       ghp.getSearchBtn().click();
    }
    @When("I select the first matched item")
    public void i_select_the_first_matched_item() {
        srp.getFirstItem().click();
    }
    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

