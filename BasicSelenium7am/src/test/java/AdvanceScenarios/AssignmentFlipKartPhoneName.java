package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFlipKartPhoneName {

	public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[.='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	for (WebElement ele : names) 
	{
		System.out.println(ele.getText());
	}
	
	}}
