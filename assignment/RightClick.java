package week5.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement rightclick = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
        System.out.println(rightclick.getLocation());
        Actions builder=new Actions(driver);
        builder.contextClick().perform();
        
	}

}
