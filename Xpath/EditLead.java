package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
		driver.findElement(By.xpath("//div[@id='button']//img[1]")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("sugan");
		driver.findElement(By.xpath("//table[@id='ext-gen242']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=11395']")).click();
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=11395']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("TCS");
		driver.close();
		
		
		
		
	}

}
