package week5.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowColumns {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get the row count
		List<WebElement> rowcount= driver.findElements(By.xpath("(//div[@class='post-single clearfix']//div)[2]//tr"));
	    System.out.println("Row count: "+rowcount.size());
	    List<WebElement> columncount = driver.findElements(By.xpath("(//div[@class='post-single clearfix']//div)[2]//th"));
	    System.out.println("Column Count: "+columncount.size());
	
	}

}
