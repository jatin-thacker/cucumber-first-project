package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"}, glue={"stepdefs"}
)
public class RunnersTests {
    public static void main(String[] args) {
    }
}