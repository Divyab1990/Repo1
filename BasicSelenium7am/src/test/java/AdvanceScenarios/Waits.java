package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//selenium version-4
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Selenium version-3
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	
	/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(searchBar));
	searchBar.sendKeys("nike");*/
	
	FluentWait fluent = new FluentWait(driver);
	fluent.pollingEvery(Duration.ofSeconds(3));
	fluent.withTimeout(Duration.ofSeconds(10));
	fluent.until(ExpectedConditions.elementToBeClickable(searchBar));
	searchBar.sendKeys("nike");
	
	
	
	
	}
}
