package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithquitmethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omago.blogspot.com/");
		// to click on new popup window
		driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
		//driver.close();
		driver.quit();

	}

}
