package AdvanceScenarios;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");

		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bluetooth");
		Thread.sleep(1000);
		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	Thread.sleep(1000);
	
	for (WebElement sugg : allList) 
	{
		Thread.sleep(1000);
		System.out.println(sugg.getText());
		String allSugg = sugg.getText();
		if(allSugg.equalsIgnoreCase("bluetooth earphones wireless"))
		{
			sugg.click();
			break;
		}
	}
	
	
	
	}

}
