package searchcontext;

import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.util.TraverserState.EndList;

public class WorkingwithfindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    	driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone",Keys.ENTER);
		//WebElement iphoneprice=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		//System.out.println(iphoneprice.getText());
		List<WebElement>alliphone=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(WebElement iphone:alliphone)
		{
			System.out.println(iphone.getText());
		}

	}

}
