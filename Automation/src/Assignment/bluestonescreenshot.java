package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class bluestonescreenshot {

	public static void main(String[] args) throws IOException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.bluestone.com/");
	  driver.findElement(By.id("denyBtn")).click();
      WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
      Actions act = new Actions(driver);
      act.moveToElement(coin).perform();
      driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
  	  TakesScreenshot ts =(TakesScreenshot)driver;
	  File scr =ts.getScreenshotAs(OutputType.FILE);
	  File dest =new File("./screenshort/coin.png");
	  Files.copy(scr, dest);
      
      
  
	
	}
}
