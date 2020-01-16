package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	
	WebDriver driver; 
	
	public LoginSteps() {
		
		System.setProperty("webdriver.chrome.driver","//Users//veena.arya@ibm.com//eclipse-workspace//com.learning//src//test//resources//chromedriver");
		driver=new ChromeDriver(); 
	
	}
	
	
	@Given("User launches chrome browser")
	public void user_launches_chrome_browser() {
		
	}

	@When("user opens registration page")
	public void user_opens_registration_page() {
		driver.get("https://book.spicejet.com/Register.aspx");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
	}
	
	@Then("user closes browser")
	public void user_closes_browser() throws Throwable {
		Thread.sleep(5000);
		driver.quit();
		
	}

}






      



   

