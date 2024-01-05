package DropdopwnHanding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithgetFirstselectoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		//identify multiselect dropdown
		WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		//create the object class
		Select s=new Select(dropdown);
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
       //use getfirstselectoption
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
