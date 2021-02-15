package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement AlertwithTextbox = driver.findElement(By.xpath("(//a[contains(text(),'Alert with')])[3]"));
		AlertwithTextbox.click();
		
		
		  
		  WebElement Clickthebutton = driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]"));
		  Clickthebutton.click();
		 
		 Thread.sleep(5000);
		
		  org.openqa.selenium.Alert alert = driver.switchTo().alert();
		  alert.sendKeys("Selenium");
		  alert.accept();
		  alert.dismiss();
		 
		
		
	}
	

}
