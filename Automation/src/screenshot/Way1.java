package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/iphone");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File scr =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshort/iphone.png");
		Files.copy(scr, dest);

	}

}
