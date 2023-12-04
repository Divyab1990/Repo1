package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser {

	public static void main(String[] args) {
		
	//	Case1:-
		
		/*String key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		
		System.setProperty(key, Value);
		WebDriver driver=new ChromeDriver();*/
		
		
		WebDriver driver=new EdgeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
	
		
	}

}
