package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithDemoshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Mohit");
		driver.findElement(By.name("LastName")).sendKeys("Nemade");
		driver.findElement(By.id("Email")).sendKeys("mohitnemade@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mohit@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Mohit@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("mohitnemade@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mohit@123");
		driver.findElement(By.className("button-1 login-button")).click();
		String actual_title=driver.getTitle();
		System.out.println("The title of current web page is:"+actual_title);
		
		

	}

}
