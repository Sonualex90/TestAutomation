package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","html:target/HTML_Reports/HtmlReports",
                  "json:target/JSonReports/JsonReports.json",
                  "junit:target/JunitReports/JunitReports.xml"
}

)
public class TestRunner {

}
