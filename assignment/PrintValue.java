package week5.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rowcount= driver.findElements(By.xpath("(//div[@class='post-single clearfix']//div)[2]//tr/td[1]"));
		for (int i = 0; i < rowcount.size(); i++) {
			System.out.println(rowcount.get(i).getText());
			
		}
		

	}

}
