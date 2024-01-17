package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Paytm {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
	   WebElement scrolltill = driver.findElement(By.xpath("(//div[@class='_2EGQY'])[2]"));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(ture)",scrolltill);
		//driver.findElement(By.xpath("(//div[@class='_2EGQY'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_3xDDz'][1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//div[text()='21']")).click();
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1zafZ'][1]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshort/ticket.png");
		Files.copy(src, dest);
		
		
	}

}
