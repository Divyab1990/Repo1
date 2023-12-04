package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUp {

	@Test
	public void browserNativePopUp() {
	
		
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in");*/
		
	/*	EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--InPrivate");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(opt);
		driver.get("https://www.amazon.in");*/
		
	FirefoxOptions opt = new FirefoxOptions();
	opt.addArguments("---Private browsing");
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver(opt);
	
	
	
	}

}
