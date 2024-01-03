package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFlipkatriphonetwo {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//span[text()='✕']")).click();
	  driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
      List<WebElement>productName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
      for(WebElement name:productName)
      {
    	  String iphoneName=name.getText();
    	  String iphoneprice=driver.findElement(By.xpath("//div[text()='"+iphoneName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
    	  System.out.println(iphoneName+":"+iphoneprice);
    	  
      }
    	  
}
}