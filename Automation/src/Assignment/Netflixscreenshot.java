package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Netflixscreenshot {

	public static void main(String[] args) throws IOException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.netflix.com/in/");
		  driver.findElement(By.id("signIn")).click();
		  driver.findElement(By.id("id_userLoginId")).sendKeys("mohit@gmail.com");
		  driver.findElement(By.id("id_password")).sendKeys("Mohit@123");
		  driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File scr =ts.getScreenshotAs(OutputType.FILE);
		  File dest =new File("./screenshort/sign in.png");
		  Files.copy(scr, dest);
	}

}
