package MethodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithisDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
       WebElement loginbutton= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
       if (loginbutton.isDisplayed())
       {
    	   System.out.println("login button is displayed");
       }
       else
       {
    	   System.out.println("login button is not displayed");
       }

	}

}
