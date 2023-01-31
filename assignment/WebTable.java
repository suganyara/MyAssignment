package week5.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//count of row
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@role='grid']//tr"));
		System.out.println("Row Count "+rowcount.size());
		//get the column count
		List<WebElement> columncount = driver.findElements(By.xpath("//table[@role='grid']//tr[1]/td"));
		System.out.println("Column count "+columncount.size());
		 String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//th[1]")).getText();
		 System.out.println(text);
		 String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[3]/td[2]")).getText();
	     System.out.println(text2);
			}

}
