package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownByXpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[.=\"5\"]")).click();

		driver.findElement(By.xpath("//option[.='Aug']")).click();
		
		driver.findElement(By.xpath("//option[@value='2017']")).click();
	}

}
