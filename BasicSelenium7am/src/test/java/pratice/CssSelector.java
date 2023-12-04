package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
		//launching browser
		WebDriver driver=new EdgeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
        
		//maximizing window
		driver.manage().window().maximize();
		
		//syntax1:- [AttributeName="AttributeValue"]
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("admin");
	
		//syntax1:- [AttributeName="AttributeValue"]
	    //driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("manager");
	
	   //syntax5:- .AttributeVAlue   ---->shortcut for class()
	   //driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
	
	  //syntax6:- htmltag.AttributeVAlue   ---->shortcut for class()
	  driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	}

}
