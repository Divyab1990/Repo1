package AdvanceScenarios;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonEx {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.flipkart.com");
	    WebElement ele = driver.findElement(By.name("q"));
	    ele.sendKeys("iphone");
	    ele.submit();
 java.util.List<WebElement> eles = driver.findElements(By.xpath("//*[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1'][number(translate(text(),'₹,',''))>70000]"));
	   
	    
	   for (WebElement webEle : eles) 
	    {
		System.out.println(webEle.getText());	
		}
	    }
	


}