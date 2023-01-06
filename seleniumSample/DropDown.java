package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown {

	public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.leafground.com");
	driver.manage().window().maximize();
driver.findElement(By.className("ui-selectonemenu"));

	}

}
