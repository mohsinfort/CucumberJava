package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "stepDefinations" }, monochrome = true, plugin = {
		"pretty", "html:target/HtmlReport/report.html","json:target/JsonReport/report.json", "junit:target/JunitReport/report.xml" })
public class TestRunner {

}
