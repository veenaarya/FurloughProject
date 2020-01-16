import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = {"Steps"},
plugin = {"html:target/html/cucumber-html-report", "json:target/cucumber.json", "pretty"},
monochrome = true )
public class TestRunner {

}
