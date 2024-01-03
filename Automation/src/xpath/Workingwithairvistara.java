package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithairvistara {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//input[@class='oneway-trip-btn']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City'][1]")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City'][1]")).sendKeys("Gao");
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='depart']")).click();
		driver.findElement(By.xpath("//a[@aria-current='true']")).click();
		//driver.findElement(By.xpath("//label[text()='Passengers']")).click();
		

	}

}
