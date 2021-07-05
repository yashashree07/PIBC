package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/PaymentFlowFeatures"
		,glue= {"StepDefinition"}
		,monochrome=true
		,dryRun=false
	        ,tags="@TC_14_07_InwardPaymentReturnfromSignatureCheck"
		,plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class TestRunner1 {

}
