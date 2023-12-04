package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_PopUp {

	@Test
	public void fileUpload_PopUp() throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.foundit.in/");
driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\Shobha\\Desktop\\PopupNotes.txt");
	}

}
