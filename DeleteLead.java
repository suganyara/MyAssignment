
package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
	driver.findElement(By.xpath("//div[@id='button']//img[1]")).click();
	driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
	driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("95");
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
	
	

	}

}
