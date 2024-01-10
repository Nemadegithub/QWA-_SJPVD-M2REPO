package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		//identify the circle
		WebElement circle = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		//use click and hold method
		act.clickAndHold(circle).perform();
		Thread.sleep(3000);
		act.release().perform();

	}

}
