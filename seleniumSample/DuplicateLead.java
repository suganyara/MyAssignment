package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

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
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suganyar1695@gmail.com");
driver.findElement(By.id("submitButton")).click();
String title= driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
driver.findElement(By.name("submitButton")).click();
String title1= driver.getTitle();
System.out.println(title1);

}

	}

