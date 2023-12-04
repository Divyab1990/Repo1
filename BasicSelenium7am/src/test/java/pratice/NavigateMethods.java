package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable   {
		
		WebDriver driver=new EdgeDriver();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
