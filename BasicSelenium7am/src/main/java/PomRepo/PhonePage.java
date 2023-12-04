package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonePage {

	public PhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//span[text()='51,999'])[1]")
	private WebElement PhonePrize;


	public WebElement getPhonePrize() {
		return PhonePrize;
	}

	
	public void fetchPhonePrice()
	{
		System.out.println(PhonePrize.getText());
	
	}
	
	
}
