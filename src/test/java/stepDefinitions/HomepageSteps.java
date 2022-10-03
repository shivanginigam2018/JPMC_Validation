package stepDefinitions;

import com.qa.pages.GoogleHomepage;
import com.qa.pages.JPMorganHomePage;
import com.qa.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static com.qa.util.TestBase.driver;

public class HomepageSteps {
    private GoogleHomepage ghp = new GoogleHomepage(driver);
    private SearchResultPage srp = new SearchResultPage();
    private JPMorganHomePage jhp = new JPMorganHomePage();

    @Given("I have a search field on Google home page")
    public void i_have_a_search_field_on_google_home_page() {
        if(ghp.getHomePageTitle().equalsIgnoreCase("Google") && ghp.getSearchKey().isDisplayed()) {
            System.out.println("Search field is displayed");
        }
    }
    @When("I search for {string}")
    public void i_search_for(String keyword) {
       ghp.getSearchKey().sendKeys(keyword);
       ghp.getSearchBtn().click();
    }
    @When("I select the first matched item")
    public void i_select_the_first_matched_item() {
        srp.getFirstItem().click();
    }

    @Then("J P Morgan logo should be displayed")
    public void should_be_displayed() {
       Assert.assertTrue(jhp.logoDisplayed());
    }

    @Then("multiple matching results should be displayed")
    public void multipleMatchingResultsShouldBeDisplayed() {
        Assert.assertTrue(srp.getListOfItems()>1);
    }

    @When("I search for {string} using key press")
    public void iCanSearchForUsingKeyPress(String keyword) {
        ghp.getSearchKey().sendKeys(keyword+ Keys.ENTER);
    }

    @Then("search field should be enabled")
    public void searchFieldShouldBeEnabled() {
        Assert.assertTrue(ghp.getSearchKey().isEnabled());
    }

    @Then("J. P. Morgan logo should be displayed")
    public void jPMorganLogoShouldBeDisplayed() {
        Assert.assertTrue(jhp.logoDisplayed());
    }

    @Then("J P Morgan logo should not be displayed")
    public void jPMorganLogoShouldNotBeDisplayed() {
        Assert.assertFalse(jhp.logoDisplayed());
    }

    @And("I select any random matched item")
    public void iSelectAndyRandomMatchedItem() {
        srp.searchRandomItem().click();
    }

    @Then("Search result page is displayed")
    public void searchResultPageIsDisplayed() {
        Assert.assertTrue(srp.getTitle().contains("Google Search"));
    }
}

