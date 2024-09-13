package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  
		features = "C:\\Users\\lenovo\\eclipse-workspace\\sadup\\day1\\Demo_QA\\src\\test\\resoure\\features",
		glue = "stepdefination",
		plugin = {
				 "html:target/MyReports/report.html"
		        },
		monochrome = true
	
		)

//@CucumberOptions(
//	 features="C:\\Users\\lenovo\\eclipse-workspace\\sadup\\day1\\Demo_QA\\src\\test\\resoure\\FeatureFiles" ,
//			 glue="stepdefination",
//			 plugin= {
//					 "html:target/MyReports/report.html"
//	 },
//monochrome = true
//)@RunWith(Cucumber.class)


public class Demo_Qa {
}
