package week5.assignmentday2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaaaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		String landingPage = driver.getTitle();
		if (landingPage.contains("L'Oreal Paris")) {
			System.out.println("Landed on correct Page");
		}

		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div[1]")).click();
		driver.findElement(By.id("category")).click();

		WebElement hair = driver.findElement(By.xpath("(//a[text()='hair'])[1]"));
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(hair).perform();
		driver.findElement(By.linkText("Shampoo")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>();
		handlesList.addAll(handles);
		driver.switchTo().window(handlesList.get(1));

		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();

		String filterText = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		if (filterText.contains("Color Protection")) {
			System.out.println("Filter applied correctly");
		}

		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();

		Set<String> handles1 = driver.getWindowHandles();
		List<String> handlesList1 = new ArrayList<String>();
		handlesList1.addAll(handles1);
		driver.switchTo().window(handlesList1.get(2));

		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select s = new Select(size);
		Thread.sleep(2000);
		s.selectByVisibleText("180ml");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		

		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("//div[@class='name medium-strong']/following-sibling::div"))
				.getText();

		System.out.println("The Grand Total " + grandTotal);

		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();

		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();

		String finalTotal = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div"))
				.getText();
		System.out.println(finalTotal);

		if (grandTotal.equals(finalTotal)) {
			System.out.println("Grand Total is same");
		}

		driver.quit();

	}

}
