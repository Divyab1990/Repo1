package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(css="#twotabsearchtextbox")
	private WebElement SearchBar;

	@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")
	private WebElement searchIcon;
	
	//gettermethods
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getSearchIcon() {
		return searchIcon;
	}

	//BusinessLogics
	public void passDataToSearchBar(String ExcelData)
	{
		SearchBar.sendKeys(ExcelData);
	}
	
	public void ClickBar()
	{
		searchIcon.click();
	}
}
