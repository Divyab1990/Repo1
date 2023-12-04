package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Throwable {

		//launching browser
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

     //launching application
driver.get("https://demo.actitime.com/login.do");

    //locators using id()
driver.findElement(By.id("username")).sendKeys("admin");

   //locators using name()
driver.findElement(By.name("pwd")).sendKeys("manager");
	
//locators using id()
	//driver.findElement(By.id("loginButton")).click();
	
   //locators using id()
 //driver.findElement(By.id("loginButtonContainer")).click();
	
//locators using className()
driver.findElement(By.className("initial")).click();
Thread.sleep(2000);

//locators using linkText()
//driver.findElement(By.linkText("View Time-Track")).click();
	
//locators using partialLinkText()
driver.findElement(By.partialLinkText("View Ti")).click();
	
	}

}
