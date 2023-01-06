package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.name("groupNameLocal")).sendKeys("Chennai");
driver.findElement(By.name("officeSiteName")).sendKeys("Test leaf");
driver.findElement(By.name("annualRevenue")).sendKeys("500000");
WebElement tool= driver.findElement(By.name("industryEnumId"));
Select drop =new Select(tool);
drop.selectByVisibleText("Computer Software");
WebElement tool1= driver.findElement(By.name("ownershipEnumId"));
Select drop1=new Select(tool1);
drop1.selectByValue("OWN_PUBLIC_CORP");
driver.findElement(By.id("numberEmployees")).sendKeys("98");
WebElement tool3= driver.findElement(By.id("marketingCampaignId"));
Select drop3= new Select(tool3);
drop3.selectByIndex(7);
WebElement tool4= driver.findElement(By.name("generalStateProvinceGeoId"));
Select drop4= new Select(tool4);
drop4.selectByValue("TX");
driver.findElement(By.className("smallSubmit"));
String title= driver.getTitle();
System.out.println(title);


	}

}
