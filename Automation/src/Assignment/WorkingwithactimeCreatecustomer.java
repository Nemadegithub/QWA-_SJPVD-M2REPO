package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithactimeCreatecustomer {

	public static void main(String[] args) throws InterruptedException {
		Random r =new Random();
		int no=r.nextInt(10000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-3mv2k3na/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sizer'][1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("JK BANK"+no);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
        driver.quit();
	}

}
