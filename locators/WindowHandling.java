package locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Handle the window
       String windowHandle = driver.getWindowHandle();
       System.out.println(windowHandle);
       System.out.println(driver.getTitle());
       //unique window remove duplicate
       //Set<String> windowHandles = driver.getWindowHandles();
       //click the new window open
       driver.findElement(By.xpath("//span[text()='Open']")).click();
       
       //getWindowHandles()
       Set<String> windowHandles = driver.getWindowHandles();
       System.out.println(windowHandles.size());//size of the window
       //convert set to list
       //create the list
       List<String>lstwindow= new ArrayList<String>(windowHandles);
       //switch the control to window
       driver.switchTo().window(lstwindow.get(1));
       System.out.println(driver.getTitle());
       driver.close();
      //find the number of opened windows
       driver.switchTo().window(lstwindow.get(0));
       driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
       Set<String> windowHandles1 = driver.getWindowHandles();
       List<String>lstwindow1= new ArrayList<String>(windowHandles);
       System.out.println("Number Taps open " +lstwindow1.size());
     //  driver.switchTo().window(lstwindow1.get(1));
       System.out.println(driver.getTitle());
       driver.switchTo().window(lstwindow.get(0));
       driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
       Set<String> windowHandles2= driver.getWindowHandles();
       List<String>lstwindow2= new ArrayList<String>(windowHandles);
       //driver.switchTo().window(lstwindow2.get(1));
       System.out.println(driver.getTitle());
     driver.quit();
     
	}

}
