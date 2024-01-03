package MethodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithisSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
       WebElement checkbox= driver.findElement(By.xpath("//input[@name='RememberMe'][1]"));
       if(checkbox.isSelected())
    	  
       {
        System.out.println("Checkbox is selected");
       }
       else
       {
    	   System.out.println("Checkbox is not selected");
       }
	}

}
