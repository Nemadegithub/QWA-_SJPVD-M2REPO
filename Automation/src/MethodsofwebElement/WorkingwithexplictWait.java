package MethodsofwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingwithexplictWait {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4']")).click();
		driver.findElement(By.id("check Delivery")).sendKeys("530125");
		//explictwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedCondition.elementtobeclickable(By.id("check")));
		driver.findElement(By.id("Check")).click();
		

	}

}