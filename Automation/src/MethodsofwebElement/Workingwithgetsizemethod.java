package MethodsofwebElement;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetsizemethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3mv2k3na/login.do");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		Dimension size=username.getSize();
		System.out.println(size);

	}

}
