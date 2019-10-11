package pr.casestudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefncasestudy {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Launch TestMe application$")
	public void beforeTest() throws Throwable {
		driver = UtilityClass.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		
	}
	
	
	@When("^user enters userName as \"([^\"]*)\"$")
	public void user_enters_userName_as(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^User enters firstName as \"([^\"]*)\"$")
	public void user_enters_firstName_as(String arg1) throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^User enters lastName as \"([^\"]*)\"$")
	public void user_enters_lastName_as(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User enters confirmPassword as \"([^\"]*)\"$")
	public void user_enters_confirmPassword_as(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);

	}

	@When("^User select gender as \"([^\"]*)\"$")
	public void user_select_gender(String arg1) throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();

	}

	@When("^User enters emailAddress as \"([^\"]*)\"$")
	public void user_enters_emailAddress_as(String arg1) throws Throwable {
	    driver.findElement(By.name("emailAddress")).sendKeys(arg1);

	}

	@When("^User enters mobileNumber as \"([^\"]*)\"$")
	public void user_enters_mobileNumber_as(String arg1) throws Throwable {
	    driver.findElement(By.name("mobileNumber")).sendKeys(arg1);

	}

	@When("^User enters dob as \"([^\"]*)\"$")
	public void user_enters_dob_as(String arg1) throws Throwable {
	    driver.findElement(By.name("dob")).sendKeys(arg1);

	}

	@When("^User enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String arg1) throws Throwable {
	    driver.findElement(By.name("address")).sendKeys(arg1);

	}

	@When("^User enters answer as \"([^\"]*)\"$")
	public void user_enters_answer_as(String arg1) throws Throwable {
	    driver.findElement(By.name("answer")).sendKeys(arg1);

	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	   driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}

	/*@When("^Enter the reg details$")
	public void doReg() throws Throwable{
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("userName")).sendKeys("Rau2384");
		driver.findElement(By.name("firstName")).sendKeys("rahul");
		driver.findElement(By.name("lastName")).sendKeys("rajan");
		driver.findElement(By.name("password")).sendKeys("Rahurag@01");
		driver.findElement(By.name("confirmPassword")).sendKeys("Rahurag@01");
		driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		driver.findElement(By.name("emailAddress")).sendKeys("rahurag@01");
		driver.findElement(By.name("mobileNumber")).sendKeys("8870078456");
		driver.findElement(By.name("dob")).sendKeys("28/04/1998");
		driver.findElement(By.name("address")).sendKeys("2/381 Sivakai virudhunagar");
		Select sec = new Select(driver.findElement(By.name("securityQuestion")));
		sec.selectByIndex(2);
		driver.findElement(By.name("answer")).sendKeys("Red");
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();*/
	@Then("^reg successful$")
	public void reg_successful() throws Throwable{
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
		Assert.assertEquals(driver.getTitle(),"Login");
		System.out.println("Reged in successfully");
		driver.close();
	}


}



