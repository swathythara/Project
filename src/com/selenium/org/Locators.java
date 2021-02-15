package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email_address = driver.findElement(By.xpath("//input[@id = 'email']"));
		email_address.sendKeys("greenstech@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id = 'pass']"));
		Password.sendKeys("fghhfg");

	//	WebElement Login = driver.findElement(By.xpath("//button[text()='Log In']"));
	//	Login.click();
		
	//	driver.navigate().to("https://www.facebook.com/");
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreateNewAccount.click();
		
		
		
	//	driver.findElement(By.xpath(null))

		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		
	
		
		
//
		Thread.sleep(5000);
		
		
	}

	
}
