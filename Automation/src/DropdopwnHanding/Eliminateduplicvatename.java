package DropdopwnHanding;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminateduplicvatename {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/Mohit/Desktop/movies.html");
	WebElement D = driver.findElement(By.id("Dropdown movies"));
	Select s = new Select(D);
	List<WebElement> alldublicateoptions = s.getOptions();
	TreeSet<String>set=new TreeSet<String>();
	for(int i=0;i<alldublicateoptions.size();i++) {
		String alloptions=alldublicateoptions.get(i).getText();
		set.add(alloptions);
	}
	for(String option:set) {
		System.out.println(option);
	}
	

	}

}
