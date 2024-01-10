package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithdragAnddrop {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
	 //drag the element
	WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	 //drop the element
	WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	//Actions act = new Actions(driver);
	 
   //act.dragAndDrop(drag,drop).perform();
    WebElement drag1 = driver.findElement (By.xpath("//div[text()='Mobile Cover']"));
    
    WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	
	Actions act =new Actions(driver);
	
	//Thread.sleep(2000);
	 act.dragAndDrop(drag,drop).perform();
	 
	 Thread.sleep(2000);
	 
	 act.dragAndDrop(drag1, drop1).perform();
	}

}
