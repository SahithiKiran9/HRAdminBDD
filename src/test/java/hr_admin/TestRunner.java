package hr_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 16/01/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/",
                 tags ="@smoke",
                format = "html:target/CucumberHTMLReports")
public class TestRunner {
}
