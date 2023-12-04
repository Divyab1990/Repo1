package AdvanceScenarios;

import org.apache.hc.core5.net.PercentCodec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		/*driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[.='✕']")).click();
	
			//To Handle Mouse Actions we use Actions Class
	      //MoveToElement
       /*WebElement eleName = driver.findElement(By.xpath("//span[text()='Fashion']"));
	       Actions act = new Actions(driver);
	        act.moveToElement(eleName).perform();*/
	
		//Wright click on Element
	/*WebElement ele = driver.findElement(By.xpath("//span[text()='Travel']"));
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();*/
			
	/*driver.get("https://www.saucedemo.com/v1/");
	WebElement USERNAME = driver.findElement(By.id("user-name"));
	WebElement PASSWORD = driver.findElement(By.id("password"));
	WebElement Login = driver.findElement(By.id("login-button"));
	
	Actions act = new Actions(driver);
  /*  act.sendKeys(USERNAME, "standard_user").perform();
	act.sendKeys(PASSWORD, "secret_sauce").perform();
	act.click(Login).perform();*/
	//or
//act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(Login).build().perform();
	
	/*	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	
	    Actions act = new Actions(driver);
	  //  act.dragAndDrop(drag, drop).perform();
	 //  act.clickAndHold(drag).perform();
	 //  act.release(drop).perform();
	//or
	  act.clickAndHold(drag).release(drop).perform();*/
		
	/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
    Actions act = new Actions(driver);
	 act.doubleClick(ele).perform();*/
		
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		 Actions act = new Actions(driver);
		 act.moveByOffset(20, 20).click().perform();
	}

}
