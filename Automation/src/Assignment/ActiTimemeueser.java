package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ActiTimemeueser {

	public static void main(String[] args) throws InterruptedException, IOException {
		Random r=new Random();
		int no=r.nextInt(10000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-3mv2k3na/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.name("username")).sendKeys("Mohit"+no);
		driver.findElement(By.name("passwordText")).sendKeys("Mohit@123");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Mohit@123");
		WebElement dropdown = driver.findElement(By.name("active"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		driver.findElement(By.name("firstName")).sendKeys("Mohit");
		driver.findElement(By.name("lastName")).sendKeys("Nemade");
		driver.findElement(By.name("email")).sendKeys("mohit3@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("022-9865874532");
		driver.findElement(By.name("fax")).sendKeys("123-789-4569");
		driver.findElement(By.name("mobile")).sendKeys("9587642132");
		driver.findElement(By.name("otherContact")).sendKeys("9125469875");
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='ext-gen20']")).click();
        driver.findElement(By.xpath("//span[text()='19']")).click();
        driver.findElement(By.xpath(" //input[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Nemade, Mohit (Mohit2001)'")).click();
        driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
        TakesScreenshot ts =(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./screenshort/popup.png");
        Files.copy(src, dest);

	}

}
