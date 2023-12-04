package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_PopUp {

	@Test
	public void authentication_PopUp()
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
	
		//syntax:- ( https://username:password@url)
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	}

}
