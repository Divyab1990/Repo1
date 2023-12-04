package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyBoardUsingKeysClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		//Normal Approch
/*driver.findElement(By.id("user-name")).sendKeys("standard_user");

driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

driver.findElement(By.id("login-button")).click();*/
	
//case1:-
	  /*  driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement PASSWORD = driver.findElement(By.cssSelector("#password"));
	    PASSWORD.sendKeys("secret_sauce");
		PASSWORD.sendKeys(Keys.ENTER);*/
	
		//case2:-
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement PASSWORD = driver.findElement(By.cssSelector("#password"));
	    PASSWORD.sendKeys("secret_sauce",Keys.ENTER);*/
		
		//case3:-
driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	
	}

}
