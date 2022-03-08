package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features/Register.feature"},
		glue = "StepDefinition",
		monochrome = true,
		tags="@SmokeTest", // to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
            "html:target/MyReports/report.html",
            "json:target/MyReports/report.json",
            "junit:target/MyReports/report.xml",
            },
        publish=true,
        dryRun=false // to tell whether to test run(true) or actual run(false)
        )	
public class TestRunner {

}
