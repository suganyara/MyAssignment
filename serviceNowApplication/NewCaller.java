package serviceNowApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewCaller {
	@Test
	public  void runNewCaller() throws InterruptedException  {
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
        //Actions builder=new Actions(driver);
        //builder.moveToElement(mob).perform();
        dom.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
        dom.findElementByXPath("//mark[text()='Callers']").click();
        WebElement frame = dom.findElementByXPath("//iframe[@title='Main Content']");
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("(//input[@data-type='string'])[1]")).sendKeys("suganya");
        driver.findElement(By.name("sys_user.last_name")).sendKeys("R");
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Sales Executive");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sugu134@gmail.com");
        driver.findElement(By.xpath("(//input[@class='form-control phone-number'])[1]")).sendKeys("9567154541");
        driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
        String primaryEmailDevice = driver.findElement(By.xpath("//div[text()='Primary email device created for suganya R']")).getText();
        System.out.println(primaryEmailDevice);
        driver.close(); 
}
}