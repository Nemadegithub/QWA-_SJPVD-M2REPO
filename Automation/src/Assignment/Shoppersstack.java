package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shoppersstack {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.shoppersstack.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Login']")).click();
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mohitnemade84@gmail.com");
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password@123");
    driver.findElement(By.xpath("//span[text()='Login']")).click();
    WebElement m = driver.findElement(By.xpath("//a[text()='Men']"));
    Actions act=new Actions(driver);
    act.moveToElement(m).perform();
    driver.findElement(By.xpath ("//a[text()='T-shirts']")).click();
    driver.findElement(By.xpath ("(//button[text()='add to cart'])[2]")).click();
    
	}

}
