package week5.assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StockMarket {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click stockmarket
		driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[3]")).click();
		driver.findElement(By.linkText("NSE SME Share Prices")).click();
		List<WebElement> noShares = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[6]"));
	for (int i = 2; i <noShares.size(); i++) {
		System.out.println(noShares.get(i).getText());
	}
	Set<String> dup =new LinkedHashSet<String>();
	if (noShares.size()==dup.size()) {
		System.out.println("no duplicate");
		
	} else
		System.out.println("Duplicate present");
	{

	}
	}
	}
	
