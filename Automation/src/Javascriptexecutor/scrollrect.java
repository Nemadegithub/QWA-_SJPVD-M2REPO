package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollrect {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.zomato.com/india");
		    driver.findElement(By.xpath("//p[text()='Work With Us']"));
		   
		    JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("argument[0]scrollIntoView(ture)", Scrolltill);

	}

}
