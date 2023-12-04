package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
         for(int i=0;i<5;i++)
         {
        	 js.executeScript("window.scrollBy(0,500)");
        	 Thread.sleep(1000);
       }
          for(int i=0;i<3;i++)
         {
        	 js.executeScript("window.scrollBy(0,-500)");
        	 Thread.sleep(1000);
        }
          
          
	}

}
