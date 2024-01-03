package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithpartiallinktext {
	
		public static void main(String[] args) {
			WebDriver driver =new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			//to fetch the location of webelement
			driver.findElement(By.partialLinkText("Reg")).click();

		}

	}

	


