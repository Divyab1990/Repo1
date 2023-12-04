package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathEx {

	public static void main(String[] args) throws Throwable {
		
		//launching browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		     //launching application
		driver.get("https://demo.actitime.com/login.do");
		
		//syntax1:-xpath by Attribute
		//htmltag[@AttributeNAme="AttributeValue"]
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

	//driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		
		//syntax2:-xpath by text()
		//htmltag[text()="visibleText"]
	//driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
	
		//syntax3:-xpath by contains Attribute
		//htmltag[conatins(@AttributeNAme,'AttributeVAlue')]
	driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
	
	Thread.sleep(2000);
	//syntax4:-xpath by contains Attribute
			//htmltag[conatins(text(),'AttributeVAlue')]
	driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();
	}
}
