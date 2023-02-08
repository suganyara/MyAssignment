package week5.assignmentday2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ",Keys.ENTER);
		//Get the price of the first product
		String  oneplus = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(oneplus);
		//Print the number of customer ratings for the first displayed product
	    String rating= driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	    System.out.println(rating);
	    //Mouse Hover on the stars
	    WebElement star = driver.findElement(By.xpath("(//a[@role='button']//i)[2]"));
        Actions builder=new Actions(driver);
        builder.moveToElement(star).perform();
        //Get the percentage of ratings for the 5 star
        Thread.sleep(3000);
        String Percentage = driver.findElement(By.xpath("(//a[@title='5 stars represent 63% of rating'])[3]")).getText();
        System.out.println(Percentage);
        //Click the first text link of the first image
        driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
       List<String> lst=new ArrayList<String>(windowHandles);
       driver.switchTo().window(lst.get(1));
        //Take a screen shot of the product displayed
        File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	     File dest=new  File("./snap/amazon.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);
	     //Click 'Add to Cart' button
	     driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
	     driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
	     //Get the cart subtotal and verify if it is correct
	     String amountofmob = driver.findElement(By.xpath("(//span[text()='61,999.00'])[3]")).getText();
	     System.out.println(amountofmob);
	     if (oneplus.equalsIgnoreCase(amountofmob)) {
			System.out.println("amountofmob is not correct");
		}
	     else{
			System.out.println("amountofmob is  correct");

		}
		
	   driver.close();

		}

	}


