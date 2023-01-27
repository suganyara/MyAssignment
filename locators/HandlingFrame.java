package locators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //frame index start from 0
		// to switch the control to frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		// 
		driver.switchTo().defaultContent();
		
    // print the element
		
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		
		int size = frameCount.size();
		
		System.out.println(size);
	// 
		// inside 3rd frame
		driver.switchTo().frame(2);
		// inside 4th frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		//take screenshot
		 File source = driver.getScreenshotAs(OutputType.FILE);
	     //create physical path
	     File dest=new  File("./snap/frame.png");
	     //copy source and dest
	     FileUtils.copyFile(source, dest);
	}

}
