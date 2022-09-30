package AppHooks;

import com.qa.util.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Applicationhooks {

    private WebDriver driver;
    Properties prop;
    TestBase testbase = new TestBase();

    @Before(order = 0)
    public void getProperty() {
        prop = testbase.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        testbase.init_driver(browserName);
        String url = prop.getProperty("url");
        testbase.driver.get(url);

    }

    @After(order = 0)
    public void quitBrowser() {
        testbase.driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario sc) {
        if(sc.isFailed())
            System.out.println("Scenario Failed..screenshot attached");
    }


}
