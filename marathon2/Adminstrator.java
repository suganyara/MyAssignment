package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Adminstrator {
	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(option);
			// Launch Salesforce application https://login.salesforce.com/
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Login with username as "hari.radhakrishnan@qeagle.com" and password as "Leaf@123"
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Leaf@123");
			driver.findElement(By.id("Login")).click();
			//Click on Learn More link in Mobile Publisher
			driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
			Set<String> windowHandles = driver.getWindowHandles();
		       List<String> lst=new ArrayList<String>(windowHandles);
		       driver.switchTo().window(lst.get(1));
		       //Click confirm on Confirm redirect
		       driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		       // Click Learning mousehover
		       //shadow dom
		       Shadow dom = new Shadow(driver);
		        dom.setImplicitWait(20);
		        WebElement ele = dom.findElementByXPath("//span[text()='Learning']");
		        ele.click();
		        Actions builder=new Actions(driver);
		        builder.moveToElement(ele).perform();
		        //Mouse hover on Learning On Trailhead
		        WebElement trailhead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		        Actions builder1 = new Actions(driver);
		        builder1.moveToElement(trailhead).perform();
		        builder1.scrollToElement(trailhead).perform();

		        //driver.findElement(By.xpath("//span[text()='Learning on Trailhead']")).click();
		        //Clilck on Salesforce Certifications
                 WebElement certf = dom.findElementByXPath("//a[text()='Salesforce Certification']");
                 certf.click();
                 Set<String> windowHandles1 = driver.getWindowHandles();
  		       List<String> lst1=new ArrayList<String>(windowHandles1);
  		       driver.switchTo().window(lst1.get(1));
                 //Verify the title as Certification - Administrator Overview
  		     String EarnYourCredential = driver.findElement(By.xpath("//h1[text()='Earn your Credential']")).getText();
             System.out.println(EarnYourCredential);
             //Verify the Certifications available for Administrator Certifications should be displayed
             String administrator = driver.findElement(By.xpath("//a[@href='/en/credentials/administrator']")).getText();
  		     System.out.println(administrator);
  		     String advance = driver.findElement(By.xpath("//a[text()='Advanced Administrator']")).getText();
  		     System.out.println(advance);
  		   String business = driver.findElement(By.xpath("//a[text()='Business Analyst']")).getText();
  		     System.out.println(business);
  		     String CPQ = driver.findElement(By.xpath("//a[text()='CPQ Specialist']")).getText();
  		    System.out.println(CPQ);
		    //Take a snapshot of Ceritificate
		    File source = driver.getScreenshotAs(OutputType.FILE);
		     //create physical path
		     File dest=new  File("./screenShot/adminstrator.png");
		     //copy source and dest
		     FileUtils.copyFile(source, dest);
		     driver.close();
}
}
