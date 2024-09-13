package stepdefinaton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepdefination {
 WebDriver driver;
 
 
 @Given("Open Broser and enter URL")
 public void open_broser_and_enter_url() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
   driver.get("https://demoqa.com/text-box");
 }

 @When("Enter valid full name")
 public void enter_valid_full_name() {
   WebElement Name=driver.findElement(By.xpath("//input[@autocomplete=\"off\"]"));
   Name.sendKeys("K Methamshi");
   
 }

 @When("Enter valid email")
 public void enter_valid_email() {
	  WebElement mail_id=driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
	   mail_id.sendKeys("Methamshikante134@gmail.com");
	   }

 @When("Enter Current Address")
 public void enter_current_address() {
	  WebElement Address=driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
	   Address.sendKeys("kollapur,pincod 509102");
     // Write code here that turns the phrase above into concrete actions
     
 }

 @When("Enter parmanent Address")
 public void enter_parmanent_address() {
	  WebElement P_Address=driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
	   P_Address.sendKeys("kollapur,pincod 509102");
 }

 @When("Click on submit button")
 public void click_on_submit_button() throws InterruptedException {
	 
	 JavascriptExecutor ss=((JavascriptExecutor)driver);
	 WebElement button=driver.findElement(By.id("submit"));
	 ss.executeScript("window.scrollBy(0,500);");
	 Thread.sleep(3000);
	 ss.executeScript("window.scrollBy(0,600);");
	 ss.executeScript("arguments[0].click();" ,button);
	 
 }

 @Then("System Should be display enter details")
 public void system_should_be_display_enter_details() {
   
 }
 
 
 @Given("Open Broser and enter URl")
 public void open_broser_and_enter_u_rl() {
	  driver = new ChromeDriver();
			driver.manage().window().maximize();
	   driver.get("https://demoqa.com/checkbox");
 }

 @And("select  checkbox")
 public void select_checkbox() throws InterruptedException {
	 JavascriptExecutor ss=((JavascriptExecutor)driver);
	 WebElement button=driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
	 ss.executeScript("window.scrollBy(0,500);");
	 Thread.sleep(3000);
	 ss.executeScript("window.scrollBy(0,600);");
	 ss.executeScript("arguments[0].click();" ,button);
    
 }

 @When("click on expand all option")
 public void click_on_expand_all_option() throws InterruptedException {
	 JavascriptExecutor ss=((JavascriptExecutor)driver);
	 WebElement button=driver.findElement(By.xpath("//button[@aria-label=\"Expand all\"]"));
	 ss.executeScript("window.scrollBy(0,500);");
	 Thread.sleep(3000);
	 ss.executeScript("window.scrollBy(0,600);");
	 ss.executeScript("arguments[0].click();" ,button);
    
 }

 @Then("system should be displayed all check box")
 public void system_should_be_displayed_all_check_box() throws InterruptedException {

 }

 @When("click on collapsAll option")
 public void click_on_collaps_all_option() throws InterruptedException {
	 JavascriptExecutor ss=((JavascriptExecutor)driver);
	 WebElement button=driver.findElement(By.xpath("//button[@aria-label=\"Collapse all\"]"));
	 ss.executeScript("window.scrollBy(0,500);");
	 Thread.sleep(3000);
	 ss.executeScript("window.scrollBy(0,600);");
	 ss.executeScript("arguments[0].click();" ,button);
    
 }

 @Then("system should be only home check box")
 public void system_should_be_only_home_check_box() {
     // Write code here that turns the phrase above into concrete actions
     throw new io.cucumber.java.PendingException();
 }

 @When("click on Taggle button")
 public void click_on_taggle_button() throws InterruptedException {
	 JavascriptExecutor ss=((JavascriptExecutor)driver);
	 WebElement button=driver.findElement(By.xpath("//button[@title=\"Toggle\"]"));
	 ss.executeScript("window.scrollBy(0,500);");
	 Thread.sleep(3000);
	 ss.executeScript("window.scrollBy(0,600);");
	 ss.executeScript("arguments[0].click();" ,button);
   
 }

 @Then("System shoudld be display all elements")
 public void system_shoudld_be_display_all_elements() {
     // Write code here that turns the phrase above into concrete actions
     throw new io.cucumber.java.PendingException();
 }

 
}
