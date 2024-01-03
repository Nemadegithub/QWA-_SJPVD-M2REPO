package MethodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithisEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
       WebElement id= driver.findElement(By.id("Email"));
       if (id.isEnabled())
       {
    	   System.out.println("id textbox is enabled");
       }
       else
       {
    	   System.out.println("id textbox is disabled");
       }

	}

}
