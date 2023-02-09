package serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checking {
	@Test
	public void runChecking() throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	driver.manage().window().maximize();
	
	driver.get("https://dev65367.service-now.com/");
	
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("^rfRxD8jP/3C");
	driver.findElement(By.id("sysverb_login")).click();
	Thread.sleep(15000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement clickAll=(WebElement) js.executeScript("return document.querySelector('body > macroponent-f51912f4c700201072b211d4d8c26010').shadowRoot.querySelector('div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout').shadowRoot.querySelector('div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header').shadowRoot.querySelector('#d6e462a5c3533010cbd77096e940dd8c')");
	String click = "arguments[0].click()";
	Thread.sleep(5000);
	
	((JavascriptExecutor)driver).executeScript(click, clickAll);	
	
	Thread.sleep(5000);
	
	WebElement input = (WebElement) js.executeScript("return document.querySelector('body > macroponent-f51912f4c700201072b211d4d8c26010').shadowRoot.querySelector('div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout').shadowRoot.querySelector('div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header').shadowRoot.querySelector('nav > div > sn-polaris-menu:nth-child(1)').shadowRoot.querySelector('#filter')");
	
	input.sendKeys("Proposal");
	Thread.sleep(3000);
	input.sendKeys(Keys.RETURN);
	
	Thread.sleep(5000); 
	
	WebElement frame = (WebElement)js.executeScript("return document.querySelector(\'body > macroponent-f51912f4c700201072b211d4d8c26010\').shadowRoot.querySelector(\'#gsft_main\')");
	driver.switchTo().frame(frame);
	
	WebElement newButton = (WebElement)js.executeScript("return document.querySelector(\'#sysverb_new\')");
	newButton.click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("std_change_proposal.short_description")).sendKeys("Replace Printer");
	driver.findElement(By.id("sysverb_insert")).click();
}
}