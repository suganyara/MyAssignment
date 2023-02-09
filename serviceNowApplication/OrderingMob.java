package serviceNowApplication;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class OrderingMob extends ProjectSpecificMethod  {
	@Test
		public  void runOrderingMob()  {
				ChromeOptions option = new ChromeOptions();
		    option.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(option);
				driver.get("https://dev65367.service-now.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("user_name")).sendKeys("admin");
				driver.findElement(By.id("user_password")).sendKeys("^rfRxD8jP/3C");
				driver.findElement(By.id("sysverb_login")).click();
				//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
				//shadow dom
			       Shadow dom = new Shadow(driver);
			        dom.setImplicitWait(20);
			        WebElement mob = dom.findElementByXPath("//div[text()='All']");
		            mob.click();
		            Actions builder=new Actions(driver);
			        builder.moveToElement(mob).perform();
			        WebElement service = dom.findElementByXPath("//span[text()='Service Catalog']");
			        service.click();
			        //click on mobile
			        WebElement frame = dom.findElementByXPath("//iframe[@title='Main Content']");
			        driver.switchTo().frame(frame);
			        driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
			    //Select Apple iPhone 13
			        driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
			       //Click as No in Is this a replacement for a lost or broken iPhone?
			        driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
			        //Select Unlimited in  Monthly data allowance
			         WebElement tool = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
			         Select drop= new Select(tool);
			         drop.selectByIndex(2);
			         //Choose color field as Blue and storage field as 256 GB
			         driver.findElement(By.xpath("//label[text()='Blue']")).click();
			         driver.findElement(By.xpath("//label[text()='Blue']")).click();
			         //Click  Order now option
			         driver.findElement(By.id("oi_order_now_button")).click();
			         //Verify order is placed and get the request number"
			         String text = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
			         System.out.println(text);
			         String req = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']//b[1]")).getText();
			         System.out.println(req);
			         //Take a Snapshot
			         //File source = driver.getScreenshotAs(OutputType.FILE);
				     //create physical path
				     File dest=new  File("./screenShot/mobile.png");
				     //copy source and dest
				     //FileUtils.copyFile(source, dest);
			         //Close the browser
		            //driver.close();
			        
		
		}
		



	}


