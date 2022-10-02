package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/LogoValidation.feature",
        glue = {"stepDefinitions","AppHooks"},
        plugin = {"pretty"},
        tags = "@negativeTest-2"
        )
public class Testrunner {


}
