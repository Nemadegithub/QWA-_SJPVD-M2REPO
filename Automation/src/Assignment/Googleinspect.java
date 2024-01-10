package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googleinspect {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_0));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_1));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_2));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_3));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_4));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_5));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_6));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_7));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_8));
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress((KeyEvent.VK_9));
		
	
		
	}

}
