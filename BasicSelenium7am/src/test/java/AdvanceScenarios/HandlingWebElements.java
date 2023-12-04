package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for (WebElement link : allLinks)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("total num of links:"+count);
	}
}
