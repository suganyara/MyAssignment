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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Mouse hover on MeN
		WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		Actions builder=new Actions(driver);
        builder.moveToElement(men).perform();
        //Click Jackets
        driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
        //Find the total count of item
         String item = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
         System.out.println(item +" overall jacket");
         //Validate the sum of categories count matches
         driver.findElement(By.xpath("//label[text()='Jackets']")).click();
         //Check jackets
         String item2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
         System.out.println(item2 + "new jacket");
        //Click + More option under BRAND
         driver.findElement(By.xpath("(//div[@class='filter-search-filterSearchBox']//span)[1]")).click();
         //Type Duke and click checkbox
         driver.findElement(By.className("filter-search-inputBox")).sendKeys("Duke",Keys.ENTER);
         driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']")).click();
         // Confirm all the Coats are of brand Duke
         Thread.sleep(6000);
        List<WebElement> Duke= driver.findElements(By.xpath("//div[@class='product-productMetaInfo']//h3"));
      for (int i = 0; i < Duke.size(); i++) {
    	  
    	 	     String names =  Duke.get(i).getText();
    	     System.out.println(names);
	}
      //Sort by Better Discount
      driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
      driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
      // Find the price of first displayed item
      String amount = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
      System.out.println(amount);
      //Click on the first product
      
     driver.findElement(By.xpath("//img[@alt='Duke Men Grey Bomber Jacket']")).click();
      Set<String> windowHandles = driver.getWindowHandles();
      List<String> lst=new ArrayList<String>(windowHandles);
      driver.switchTo().window(lst.get(1)); 
      //Take a screen shot
      File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	     File dest=new  File("./screenShot/myntra.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);
	     //Click on WishList Now
	     driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[2]")).click();

	}

}
