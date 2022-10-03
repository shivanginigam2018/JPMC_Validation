package AppHooks;

import com.qa.util.TestBase;
import com.qa.util.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Applicationhooks {

    Properties prop;
    TestBase testbase = new TestBase();
    Utility util = new Utility();

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
    public void tearDown(Scenario sc) throws IOException {
        if (sc.isFailed()) {
            String screnarioName = prop.getProperty("screenShotPath");
            String timeStamp = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
            screnarioName = screnarioName + timeStamp;
            System.out.println("Scenario Failed..screenshot attached");
            util.takeScreenshot(screnarioName);
        }
    }
}
