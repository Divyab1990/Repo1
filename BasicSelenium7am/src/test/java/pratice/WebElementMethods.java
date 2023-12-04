package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//method1:-getCssValue()
		/*driver.get("https://www.facebook.com");
		WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String logo = fbLogo.getCssValue("font-size");
	    System.out.println(logo);
	
	    WebElement fbLogo1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	    String logo1 = fbLogo1.getCssValue("color");
	    System.out.println(logo1);*/
		
		/*driver.get("https://www.amazon.in");
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		String data = logo.getCssValue("font-size");
	    System.out.println(data);*/
		
		//method2:-sendKeys()
	   /*driver.get("https://www.amazon.in");	
	    WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	   searchBar.sendKeys("puma");
	 
	   //method3:-clear()
	   Thread.sleep(2000);
	   searchBar.clear();
	   Thread.sleep(2000);
	   searchBar.sendKeys("nike");*/
		
		//driver.get("https://www.amazon.in");
		//method4:-submit()
		/*WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchBar.sendKeys("puma");
	    searchBar.submit();//submit() will work only for searchBar*/
	
		/*WebElement data = driver.findElement(By.xpath("//a[text()='Facebook']"));
		//method5:-getLocation()
		Point text = data.getLocation();
	    System.out.println(text);
	    System.out.println(text.getX());
	    System.out.println(text.getY());
	    
	    //method6:-getSize()
	    Dimension size = data.getSize();
	    System.out.println(size.getHeight());
	    System.out.println(size.getWidth());
	
	    //method7:-getRect()
	    Rectangle rect = data.getRect();
	    System.out.println(rect.getX());
	    System.out.println(rect.getY());
	    System.out.println(rect.getHeight());
	    System.out.println(rect.getWidth());*/
	    
		 //method8:-isDisplayed()
	/*    WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	if(logo.isDisplayed())
	{
		System.out.println("Logo Displayed");
	}
	else
	{
		System.out.println("Logo not Displayed");
	}*/

		/*	Thread.sleep(2000);
 * //method9:isEnabled()
WebElement searchBar = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		
if(searchBar.isEnabled())
{
	searchBar.sendKeys("Bluetooth");
}
else
{
	System.out.println("Not Enabled");
}*/
		
		//driver.get("https://www.facebook.com");
	/*driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
//method10:-isSelected
WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
radioButton.click();
	if(radioButton.isSelected())
	{
		System.out.println("radioButton is Selected");
		}
	else
	{
		System.out.println("radioButton is not Selected");
	}*/
		
		//method11:-getAttribute()
  /*WebElement data = driver.findElement(By.xpath("//a[text()='Create new account']"));
	System.out.println(data.getAttribute("class"));
	
	WebElement text = driver.findElement(By.xpath("//a[text()='हिन्दी']"));
	System.out.println(text.getAttribute("title"));*/
	
		//method12:-getTagName()
		/*driver.get("https://www.amazon.in");
	//WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	//System.out.println(logo.getTagName());
	
	//method13:-getAriaRole()
	WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	System.out.println(searchBar.getAriaRole());*/
	
	/*	driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	WebElement data = driver.findElement(By.xpath("//input[@aria-label='First name']"));
	System.out.println(data.getAriaRole());

	WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	System.out.println(radioButton.getAriaRole());*/
		
		//DOM :-Document Object Model
		//method14:-getDomAttribute()
	/*	driver.get("https://www.amazon.in");
		WebElement data = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	System.out.println(data.getDomAttribute("tabindex"));
	
	//method15:-getDomProperty()
	WebElement text = driver.findElement(By.xpath("//span[text()='Prime']"));
	System.out.println(text.getDomProperty("attributeStyleMap"));
	
	//method16:-getAccessibleName()
	WebElement data1 = driver.findElement(By.id("nav-logo-sprites"));
	System.out.println(data1.getAccessibleName());*/
		
		//method17:-getAccessibleName()
	/*	driver.get("https://www.facebook.com");
 WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	System.out.println(fbLogo.getAccessibleName());*/
	
	//method18:-getText()
	   driver.get("https://www.amazon.in");
		WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBar.sendKeys("iphone");
		searchBar.submit();
//String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
//System.out.println(price);
	
String name = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]")).getText();
System.out.println(name);
	}
}
