package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
	    
		WebElement IframewithinIframebox = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		IframewithinIframebox.click();
		   
		  WebElement ParentFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		  driver.switchTo().parentFrame();
		  
          WebElement InnerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
          driver.switchTo().frame(InnerFrame);
          
          
          WebElement Textbox = driver.findElement(By.xpath("//input[@type='text']"));
          Textbox.sendKeys("Good");
     
          
	}

}

