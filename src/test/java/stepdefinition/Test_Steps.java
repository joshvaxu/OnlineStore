package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test_Steps {

	private static WebDriver driver = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

        driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("http://www.store.demoqa.com");

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {

        // Find the element that's ID attribute is 'account'(My Account) 

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

        driver.findElement(By.id("log")).sendKeys("joshvaxu");

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.id("pwd")).sendKeys("@x*^62Y!8Eir21WA");

        // Now submit the form. WebDriver will find the form for us from the element 

        driver.findElement(By.id("login")).click();

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {

		// Print a Log In message to the screen

		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {

		// Find the element that's ID attribute is 'account_logout' (Log Out)

		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();

	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {

		// Print a Log In message to the screen

		System.out.println("LogOut Successfully");

		// Close the driver

		driver.quit();
	}
}
