package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEX {

	@Test
	public void m1()
	{
	String ExpData = "Qspiders";
	String ActData = "Jspiders";
	
      SoftAssert soft = new SoftAssert();
     soft.assertEquals(ActData, ExpData);
	soft.assertAll();
	
	}
}
