package serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Fillmandatoryfields {
	
@Test
	public  void runFillmandatoryfields() throws InterruptedException  {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("https://dev65367.service-now.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("user_password")).sendKeys("^rfRxD8jP/3C");
			driver.findElement(By.id("sysverb_login")).click();
			Shadow dom = new Shadow(driver);
	        dom.setImplicitWait(30);
	        WebElement mob = dom.findElementByXPath("//div[text()='All']");
	        mob.click();
	        dom.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
	        dom.findElementByXPath("//mark[text()='Knowledge']").click();
	        WebElement frame=dom.findElementByXPath("//iframe[@title='Main Content']");
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@class='form-control element_reference_input']")).sendKeys("IT");
			driver.findElement(By.xpath("(//input[@class='form-control element_reference_input'])[2]")).sendKeys("Java");
			driver.findElement(By.xpath("//input[@data-type='string']")).sendKeys("To write about selenium");
			driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
}}
