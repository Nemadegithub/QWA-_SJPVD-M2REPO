package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Paytmticket {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		WebElement scrolltill = driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(false)",scrolltill);
	    scrolltill.click();
	    //enter the value inside the text field
	    driver.findElement(By.id("srcCode")).click();
	    driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click(); 
	    driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	    //enter the value inside the text field
	    driver.findElement(By.id("destCode")).click();
	    driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click(); 
		driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
		//click on depature date
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//div[text()='24']")).click();
		//click on traveller class
		driver.findElement(By.xpath("//div[@id='travellerClass']")).click();
		//select 4 adults
		for(int i=0;i<=2;i++) {
			driver.findElement(By.xpath("//img[@alt='add-icon'][1]")).click();
			Thread.sleep(2000);
		}
		//click  on flight search button
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		//all flight in your console
         List<WebElement> allflight = driver.findElements(By.xpath("//div[@class='M9kpV']"));
         for(WebElement flight:allflight){
        	 System.out.println(flight.getText());
        	 System.out.println("---------------------------------------------------------------------");
        	 
         TakesScreenshot ts=(TakesScreenshot)driver;
         File src=ts.getScreenshotAs(OutputType.FILE);
         File dest=new File("./screenshort/flights.png");
         Files.copy(src, dest);
        	 
         }
	   

	}

}
