package locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//from contact to contact
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lstWindow=new ArrayList<String>(windowHandles);
		//switch to window
		driver.switchTo().window(lstWindow.get(1));
		driver.findElement(By.xpath("(//a[@class=\"linktext\"])[1]")).click();
		driver.switchTo().window(lstWindow.get(0));
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>nxtwindow=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(nxtwindow.get(1));
		driver.findElement(By.xpath("(//a[@class=\"linktext\"])[5]")).click();
		driver.switchTo().window(nxtwindow.get(0));
		//merge
		driver.findElement(By.linkText("Merge")).click();
		//alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		System.out.println(title);
		//Thread.sleep(4000);
		//driver.close();
		
		
		
	}

}
