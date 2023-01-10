package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		 driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("suganya");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")).sendKeys("R");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("9585165933");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9845");
	driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//label")).click();
	
	
	}
	

}
