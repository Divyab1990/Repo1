package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonEx {

	public static void main(String[] args) {
		
		//launching browser
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");
	
driver.manage().window().maximize();
//driver.findElement(By.name("field-keywords")).sendKeys("puma");	
	
//syntax1:- [AttributeName="AttributeValue"]
//driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("nike");

//syntax2:- htmltag[AttributeName="AttributeValue"]
driver.findElement(By.cssSelector("a[data-csa-c-slot-id=\"nav_cs_5\"]")).click();
//driver.findElement(By.linkText("Today's Deals")).click();

/*driver.get("https://www.flipkart.com");

driver.findElement(By.className("_30XB9F")).click();
driver.findElement(By.name("q")).sendKeys("iphone");

//driver.findElement(By.linkText("Mobiles")).click();*/
	}

}
