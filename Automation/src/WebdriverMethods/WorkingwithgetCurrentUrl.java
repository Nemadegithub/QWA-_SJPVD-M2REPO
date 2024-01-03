package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithgetCurrentUrl {

	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver =new ChromeDriver();
		//to Maximize web application
		driver.manage().window().maximize();
		//to launch the web application
		driver.get("https://www.amazon.in/");
		//to feach the current url
		String url=driver.getCurrentUrl();
		//system.out.println("the url of amazon is:"url);
		if(url.equals("https://www.amazon.in/"))
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
		

	}

}
