package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {

	public static void main(String[] args) {
		
	//selenium Version:-3.141.59,4.12.1 
	//WebDRiverManager Version:-5.1.0,5.4.0,5.5.3.5.3.2

	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		
//selenium version 4.9.1 and above webdrivermanager is not required
		WebDriver driver=new EdgeDriver();
		
		//webdriver methods
		//11+12=13M
		
		//get()---->launching webapplication
		driver.get("https://www.flipkart.com");
		
		//getTitle()--->fetches title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl()--->fetches Url of the application.
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	
		//getPageSource()--->fetches the source code of the webpage
		String source = driver.getPageSource();
	 //  System.out.println(source);
	
		//manage()--->maximizing and minimizing window
		/*Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();*/
		//or
		driver.manage().window().maximize();
	
	//	driver.manage().window().minimize();
	
		//close()--->closes a single tab/window currently driver in focus 
		driver.close();
		
		//quit()--->closes all the tabs/windows including browser
	//	driver.quit();
	}

}
