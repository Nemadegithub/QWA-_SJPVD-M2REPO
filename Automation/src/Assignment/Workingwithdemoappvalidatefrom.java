package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithdemoappvalidatefrom {



	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/formValidation?sublist=0");
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("MOHIT NEMADE");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mohit@123");
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Mohit@123");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mohit1@gmail.com");
		driver.findElement(By.name("url")).sendKeys("mohit@gmail.com");
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("1236487955");
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("125487955");
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("abcd123");
		driver.findElement(By.name("minLength")).sendKeys("MOHIT NEMADE");
		driver.findElement(By.name("maxLength")).sendKeys("MOHIT");
		driver.findElement(By.name("rangeLength")).sendKeys("mohit@gm");
		driver.findElement(By.name("minValue")).sendKeys("20");
		driver.findElement(By.name("maxValue")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("60");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
		
}
		

	


