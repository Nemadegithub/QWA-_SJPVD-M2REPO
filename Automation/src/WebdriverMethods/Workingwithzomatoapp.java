package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithzomatoapp {

	public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.zomato.com/india");
	 //to fetch the title
	 String actual_title=driver.getTitle();
	 System.out.println("the title of current web pageis:"+actual_title);
	 //to fetch the current url
	 String url=driver.getCurrentUrl();
	 System.out.println("the url of zomato is:"+url);
	 driver.close();

	}

}
