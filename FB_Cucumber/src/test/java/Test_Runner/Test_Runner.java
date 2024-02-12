package Test_Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ckamb\\eclipse-workspace\\FB_Cucumber\\src\\test\\java\\Feature\\Login.feature",glue={"Step_defination"},monochrome= true,

plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)
public class Test_Runner {

}
