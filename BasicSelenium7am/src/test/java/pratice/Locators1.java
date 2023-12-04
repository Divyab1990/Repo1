package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
		//locator using linkText()
	//	driver.findElement(By.linkText("Today's Deals")).click();

		//locator using linkText()
		//driver.findElement(By.linkText("Amazon miniTV")).click();
	
		//locator using linkText()--->it will not work
	//driver.findElement(By.linkText("Today's")).click();
	
		//locator using partialLinkText()
	//driver.findElement(By.partialLinkText("Today's")).click();
	
	
	}

}
