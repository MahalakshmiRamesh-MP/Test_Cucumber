package maha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber {
	WebDriver driver;
	@Given("user is on the Login Page")
	public void user_is_on_the_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
	}

	@When("user enters {string} and {string} and click submit button")
	public void user_enters_and_and_click_submit_button(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//a[@ href='login.htm']")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@Then("user does successful Login")
	public void user_does_successful_Login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	}
	
	@Given(" user is on home page")
	public void user_is_on_home_page() {
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
	}
	
    @When("user click on product")
    public void user_click_on_product() {
    	driver.findElement(By.linkText("All Categories")).click();
    	
        driver.findElement(By.linkText("Electronics")).click();
    	driver.findElement(By.linkText("Head Phone")).click();
    	driver.findElement(By.className("btn")).click();
    	
    }
    
    
    @Then("user click Add to Cart button")
    public void user_click_Add_to_Cart_button() {
    	driver.findElement(By.xpath("//a[@ href='displayCart.htm']")).click();
    	driver.findElement(By.xpath("//a[@ href='checkout.htm']")).click();
    	
    }
    
    
}
