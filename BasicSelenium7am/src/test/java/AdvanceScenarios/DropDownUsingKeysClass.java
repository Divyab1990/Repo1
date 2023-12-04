package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		//4-sep-2020
		
		WebElement dayList = driver.findElement(By.id("day"));
		dayList.click();
	
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		dayList.sendKeys(Keys.ARROW_UP);
		
		dayList.sendKeys(Keys.ARROW_UP);
	}

}
