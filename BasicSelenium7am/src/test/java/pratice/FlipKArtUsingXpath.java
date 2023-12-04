package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKArtUsingXpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com");
		
		//syntax1:-  //htmltag[@AttributeName='AttributeValue']
	//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		//syntax2:-  //htmltag[text()='AttributeValue']
	//driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//*[.='✕']")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	}
}
