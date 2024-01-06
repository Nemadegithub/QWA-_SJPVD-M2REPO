package DropdopwnHanding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithgetWaappedElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Mohit/Desktop/movies.html");
		WebElement D = driver.findElement(By.id("Dropdown movies"));
		Select s = new Select(D);
		WebElement alloptions = s.getWrappedElement();
		System.out.println(alloptions.getText());

	}

}
