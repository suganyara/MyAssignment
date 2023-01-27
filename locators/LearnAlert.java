package locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click simple alert
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c'][1]")).click();
		//switch the control to alert
		Alert alert = driver.switchTo().alert();//ctrl+2+l
		//accept the alert
		String text = alert.getText();
		System.out.println(text);
		//click ok
		alert.accept();
		//click confirm alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.dismiss();
		//click sweet alert
		Thread.sleep(2000);
		//click sweet alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//click prompt alert
			driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
			Alert alert2 = driver.switchTo().alert();
			alert2.sendKeys("suganya");
			String text2 = alert2.getText();
			System.out.println(text2);
			alert.accept();
			//sweet alert delete
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			driver.findElement(By.xpath("//span[text()='No']")).click();
			//click min ans max
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		driver.findElement(By.xpath("(//a[@role='button']//span)[3]")).click();
		//click sweet modal alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
	   driver.findElement(By.xpath("(//a[contains(@class,'ui-dialog-titlebar-icon ui-dialog-titlebar-close')]//span)[2]")).click();
		driver.quit();
		
	
	}
	

}
