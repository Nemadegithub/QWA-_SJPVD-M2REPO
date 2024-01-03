package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithInstagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("mohitnemade@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mohit@123");
		driver.findElement(By.className("_acap")).click();
	    String actual_title	=driver.getTitle();
	    System.out.println("The title of current web page is"+actual_title);
		//driver.quit();

	}

}
