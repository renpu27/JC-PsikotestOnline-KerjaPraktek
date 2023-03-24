package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"cucumber"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
