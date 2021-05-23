package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
	ChromeDriver driver;
	@Given("Launch Chrome browser")
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("Load URL{string}")
	public void loadurl(String url) {
		driver.get(url);
	}	
		@And("Type username as{string}")
		public void typeusername(String username) {
			driver.findElement(By.id("username")).sendKeys(username);
	
	}
		@And("Type password as{string}")
		public void typepassword(String password) {
			driver.findElement(By.id("password")).sendKeys(password);
			
	
	}
		@And("Click Login Button")
		public void login() {
			driver.findElement(By.className("decorativeSubmit")).click();
			
	
	}
		@And("click the{string}")
		
		public void crmclick() {
			driver.findElement(By.linkText("CRM/SFA")).click();
			
	}
		@Then(" Click the leads")
		public void leadclick() {
			driver.findElement(By.linkText("Leads")).click();
			}
@And("click the FindLeads")
		
		public void findleads() {
	driver.findElement(By.linkText("Find Leads")).click();
	}
@And("click the Leaadid as(.*)$")

public void leadid(String id) {
	driver.findElement(By.name("id")).sendKeys(id);
}
@And("click the FindLead")

public void findlead() {
driver.findElement(By.linkText("Find Leads")).click();
}
@And("click the record")

public void recordclick() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
}
@And("click the delete button")

public void deletebuttonclick() {
	driver.findElement(By.linkText("Delete")).click();
}

@And("click  againfindlead button")

public void click() {
driver.findElement(By.linkText("Find Leads")).click();
}
@And("enter the lead id(.*)$")

public void leadid1(String id) {
	driver.findElement(By.name("id")).sendKeys(id);
}

@Then("verify the no record display")

public void verify() {
	String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
if(text.equals("No records to display"))
{ System.out.println("The id deleted successfully");
	
}
else {
	System.out.println("Failure to delete the id");
}




}
}
