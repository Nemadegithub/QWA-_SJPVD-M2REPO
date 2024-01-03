package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithdemoappqsidersscenario {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[placeholder='Enter your name']")).sendKeys("Mohit");
	driver.findElement(By.cssSelector("[placeholder='Enter your email']")).sendKeys("mohitnemade@gmail.com");
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("Mohit123");
    driver.findElement(By.cssSelector("[type='submit']")).click();
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("[placeholder='Enter your email']")).sendKeys("mohitnemade@gmail.com");
    driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("Mohit123");
    driver.findElement(By.cssSelector("[type='submit']")).click();
	}

}