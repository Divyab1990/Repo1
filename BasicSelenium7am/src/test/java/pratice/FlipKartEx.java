package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartEx {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com");

		//syntax1:- [AttributeName="AttributeValue"]
	//driver.findElement(By.cssSelector("[class=\"_30XB9F\"]")).click();
	
	//syntax1:- [AttributeName="AttributeValue"]
	//driver.findElement(By.cssSelector("[alt=\"Grocery\"]")).click();
	
	//syntax2:- htmltag[AttributeName="AttributeValue"]
	//driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
	
	
	
	}

}
