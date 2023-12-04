package TestNG;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShotEx {

	@Test
	public void screen() throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	EventFiringWebDriver event = new EventFiringWebDriver(driver);
	File src = event.getScreenshotAs(OutputType.FILE);
	File dest = new File("./FailedScript.png");
	FileUtils.copyFile(src, dest);
	}
}
