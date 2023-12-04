package pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PomRepo.HomePage;
import PomRepo.PhonePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PomImplementation {

	public static void main(String[] args) throws Throwable {
		
		//Launching Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//FetchingData From Properties_File
		FileInputStream fis = new FileInputStream("./CommonData7am.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		driver.get(URL);
		
		//fetching Data from excel
		FileInputStream fes = new FileInputStream("./TestData7am.xlsx");
	    Workbook book = WorkbookFactory.create(fes);
	    Sheet sheet = book.getSheet("Sheet1");
	    Row row = sheet.getRow(0);
	    Cell cel = row.getCell(0);
	   String excelData = cel.getStringCellValue();
	
	//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(excelData,Keys.ENTER);
	HomePage home = new HomePage(driver);
	home.passDataToSearchBar(excelData);
	home.ClickBar();
	
 //String Data = driver.findElement(By.xpath("(//span[text()='51,999'])[1]")).getText();
	PhonePage page = new PhonePage(driver);
	 page.fetchPhonePrice();
	}

}
