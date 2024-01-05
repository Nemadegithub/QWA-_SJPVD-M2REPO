package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookcreatenewaccount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohit");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nemade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mohitnemade@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("mohitnemade@gmail.com");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Mohit@123");
		WebElement dropdown =driver.findElement(By.id("day"));
		Select s=new Select(dropdown);
		s.selectByIndex(18);
		WebElement mon =driver.findElement(By.id("month"));
		Select p=new Select(mon);
		p.selectByIndex(1);
		WebElement year =driver.findElement(By.id("year"));
		Select q=new Select(year);
		q.selectByIndex(29);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
         
	}

}
