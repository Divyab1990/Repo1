package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);

		//5-june-2015
		/*WebElement dayList = driver.findElement(By.id("day"));
		Select sel = new Select(dayList);
		sel.selectByIndex(4);
	
	WebElement monthList = driver.findElement(By.id("month"));
	Select sele = new Select(monthList);
	sele.selectByIndex(5);
	
     WebElement yearList = driver.findElement(By.id("year"));
     Select select = new Select(yearList);
     select.selectByIndex(8);*/
	
     //Select By Value
   /*  WebElement dayList = driver.findElement(By.id("day"));
	 Select sel = new Select(dayList);
	 sel.selectByValue("20");
	
	WebElement monthList = driver.findElement(By.id("month"));
	Select sele = new Select(monthList);
	sele.selectByValue("2");
	
	 WebElement yearList = driver.findElement(By.id("year"));
     Select select = new Select(yearList);
     select.selectByValue("2015");*/
		
		//select by visibleText
		WebElement dayList = driver.findElement(By.id("day"));
		Select sel = new Select(dayList);	
		sel.selectByVisibleText("16");
	
		WebElement monthList = driver.findElement(By.id("month"));
		Select sele = new Select(monthList);
		sele.selectByVisibleText("Jun");
		
		 WebElement yearList = driver.findElement(By.id("year"));
	     Select select = new Select(yearList);
	     select.selectByVisibleText("2020");
	}

}
