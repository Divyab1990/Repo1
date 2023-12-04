package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartGroupByIndex {

	public static void main(String[] args) {

WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

driver.get("https://www.flipkart.com");

driver.manage().window().maximize();

driver.findElement(By.xpath("//span[text()='✕']")).click();
	
//GroupByIndex
//driver.findElement(By.xpath("(//div[@class='YBLJE4'])[6]")).click();
	}
}
