package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfirecroud {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://crowd.testyantra.com/");
	 driver.findElement(By.id("email")).sendKeys("mohitnemade3@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("Mohit@123");
	 driver.findElement(By.className("submitButton")).click();
	 String actual_title =driver.getTitle();
	 System.out.println("The title of current web page is:"+actual_title);
	 driver.quit();

	}

}
