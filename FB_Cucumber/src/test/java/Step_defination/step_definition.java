package Step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class step_definition {
	WebDriver driver;
	
	@Given("Launch the facebook portal")
	public void launch_the_facebook_portal() {
		driver=new FirefoxDriver ();
		driver.get("https://www.facebook.com/");
	    }

	@And("provide my login credentials")
	public void provide_my_login_credentials() {
		driver.findElement(By.cssSelector("#email")).sendKeys("ckambham");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123");
	    
	}

	@When("I complete login process")
	public void i_complete_login_process() {
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
	}

	@And("Go Home with a cup of coffee")
	public void go_home_with_a_cup_of_coffee() {
	    System.out.println("Login successful");
	}
	@Given("provide my login credentials {string} and {string}")
	public void provide_my_login_credentials_and(String username, String password) {
		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
	}
}
