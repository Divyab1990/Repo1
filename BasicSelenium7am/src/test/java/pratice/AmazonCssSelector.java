package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCssSelector {

	@Test
	public void amazonCssSelector() {

WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

driver.get("https://www.amazon.in");

//syntax1:- [AttributeName="AttributeValue"]
//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("iphone");
	
//syntax2:-htmltag[AttributeName="AttributeValue"]
//driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]")).sendKeys("bluetooth");	
	
//syntax3:- #AttributeValue
driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
	
//syntax4:- htmltag#AttributeValue
//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("puma");	
	
	}

}
