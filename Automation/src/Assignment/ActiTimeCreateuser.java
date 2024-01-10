package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeCreateuser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-3mv2k3na/login.do");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		/*driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.name("username")).sendKeys("Mohit");
		driver.findElement(By.name("passwordText")).sendKeys("Mohit@123");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Mohit@123");
		WebElement dropdown = driver.findElement(By.name("active"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		driver.findElement(By.name("firstName")).sendKeys("Mohit");
		driver.findElement(By.name("lastName")).sendKeys("Nemade");
		driver.findElement(By.name("email")).sendKeys("mohit3@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("022-9865874532");
		driver.findElement(By.name("fax")).sendKeys("123-789-4569");
		driver.findElement(By.name("mobile")).sendKeys("9587642132");
		driver.findElement(By.name("otherContact")).sendKeys("9125469875");
		/*WebElement d = driver.findElement(By.name("//select[@name='timeZoneId']"));
	    Select s1 = new Select(d);
	    s1.selectByVisibleText("(GMT-11:00) Coordinated Universal Time-1");
		driver.findElement(By.xpath("//input[@value='8:00']")).sendKeys("9:00");
		*/
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@id='ext-gen7']")).click();
		//driver.findElement(By.xpath("//button[@id='ext-gen240']")).click();
		//driver.findElement(By.xpath("(//a[text()='Mar'])[2]")).click();
		//driver.findElement(By.xpath("//a[text()='2024']")).click();
		//driver.findElement(By.xpath("//button[@id='ext-gen351']")).click();
		//driver.findElement(By.xpath("//span[text()='13']")).click();
		driver.findElement(By.xpath("//img[@id='ext-gen20']")).click();
        driver.findElement(By.xpath("//span[text()='19']")).click();
        driver.findElement(By.xpath(" //input[@type='submit']")).click();
		
		
	}

}
