package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/LogoValidation.feature",
        glue = {"stepDefinitions","AppHooks"},
        plugin = {"pretty","html:target/cucumber/report.html",
                  "json:target/cucumber/report.json"},
        tags = "@fieldEnabled"
        )
public class Testrunner {


}
