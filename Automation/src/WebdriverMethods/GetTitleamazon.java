package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleamazon {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver .manage().window().maximize();
	driver.get("https://www.amazon.com/");
	String actual_title = driver.getTitle();
	if (actual_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"k))
	{
     System.out.println("Test case is pass");
	
	}
	else
	{
		System.out.println("Test case is fail");
	}
	
}
}
