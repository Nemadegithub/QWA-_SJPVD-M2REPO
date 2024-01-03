package MethodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithrectangle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
       WebElement id= driver.findElement(By.id("Email"));
       Rectangle rect=id.getRect();
       int height =rect.getHeight();
       int width =rect.getWidth();
       int x  = rect.getX();
       int y  =rect.getY();
       System.out.println(height);
       System.out.println(width);
       System.out.println(x);
       System.out.println(y);
	}

}
