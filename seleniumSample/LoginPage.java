package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class LoginPage {
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
    String title= driver.getTitle();
    System.out.println(title);
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
	WebElement tool= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop =new Select(tool);
	drop.selectByVisibleText("Cold Call");
	WebElement tool1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop1= new Select(tool1);
	drop1.selectByValue("CATRQ_AUTOMOBILE");
	WebElement tool2= driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select drop2= new Select(tool2);
	drop2.selectByIndex(2);
	WebElement tool3= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select drop3= new Select(tool3);
	drop3.selectByVisibleText("India");
    ((WebElement) driver.findElements(By.name("submitButton"))).click();
	String Title= driver.getTitle();
	System.out.println(title);
	
	
	
	
	
	
	}
}
