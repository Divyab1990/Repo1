package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolByJavaScript {

	public static void main(String[] args) throws Throwable {

WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

driver.get("https://www.facebook.com");

WebElement data = driver.findElement(By.xpath("//a[text()='Games']"));
/*Point loc = data.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getY());
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(436,787)");
	
	Thread.sleep(2000);
	data.click();*/

/*JavascriptExecutor js1 = (JavascriptExecutor)driver;
js1.executeScript("arguments[0].scrollIntoView()",data);
	
   Thread.sleep(2000);
	data.click();*/

JavascriptExecutor js1 = (JavascriptExecutor)driver;
js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");

Thread.sleep(1000);
js1.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	
	}

}
