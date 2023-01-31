package week5.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//span[@class='ui-panel-title']"));
        System.out.println(drag.getLocation());
        Actions builder=new Actions(driver);
		//call the method in action class end with perform()
		builder.dragAndDropBy(drag, 200, 0100).perform();
		System.out.println(drag.getLocation());
		
	}

}//
