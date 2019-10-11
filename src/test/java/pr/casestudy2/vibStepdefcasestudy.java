package pr.casestudy2;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class vibStepdefcasestudy {
	WebDriver driver;
	@Given("^User is in the search page$")
	public void user_is_in_the_search_page() throws Throwable {
		driver = UtilityClass.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("^user enter \"([^\"]*)\" in the search box$")
	public void user_enter_head_in_the_search_box(String arg1) throws Throwable {
		  driver.findElement(By.name("products")).sendKeys("head");
		  driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click(); 
		  driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label/i")).click();
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		 
	}

	@Then("^user completes payment$")
	public void user_completes_payment() throws Throwable {
		Assert.assertEquals("Order Details", driver.getTitle());
		driver.close();
	}

	@When("^User enter Telephone in the search box$")
	public void user_enter_Telephone_in_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Telephone");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	    
	}

	@Then("^Unsuccessful$")
	public void unsuccessful() throws Throwable {
	    Assert.assertEquals("Search", driver.getTitle());
	    driver.close();
	}

	@When("^User left the  search box blank$")
	public void user_left_the_search_box_blank() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	
	@Then("^popup$")
	public void popup() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals("Home", driver.getTitle());
		driver.close();
	}
}
