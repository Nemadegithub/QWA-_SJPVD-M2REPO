package MethodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSubmit {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  //driver.findElement(By.xpath("//span[text()='✕']")).click();
		  driver.findElement(By.name("q")).sendKeys("iphone");
		  WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		  submitbutton.submit();
		  

	}

}
