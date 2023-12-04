package TestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {
		
		Screen scr = new Screen();

		Pattern patter1 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\MinimizeBar.png");
		scr.click(patter1);
	
		Pattern patter2 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\search.png");
		scr.click(patter2);
		scr.type(patter2, "notepad");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		Pattern patter3 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\Write.png");
		scr.click(patter3);
		scr.type(patter3, "Qspiders");
	}

}
