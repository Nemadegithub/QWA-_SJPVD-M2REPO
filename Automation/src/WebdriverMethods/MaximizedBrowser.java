package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.webdeiver.Options;

public class MaximizedBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
	}

}
