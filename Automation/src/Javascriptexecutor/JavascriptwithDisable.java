package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavascriptwithDisable {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://demoapps.qspiders.com/?scenario=1");
		    driver.findElement(By.xpath("//li[text()='Disabled")).click();
		    JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("document.getElementBy.Id('name').value='Mohit Nemade'" );
		    js.executeScript("document.getElementBy.Id('email').value='mohit@gmail.com'" );
		    js.executeScript("document.getElementBy.Id('password').value='Mohit@123'" );
		    //identify the disabled button
		   WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
		    js.executeScript("arguments[0].click()", disabledButton);
		    

	}

}
