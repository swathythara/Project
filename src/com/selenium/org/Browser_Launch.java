package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.ie.driver", "C:\\Users\\vidya\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/login.php");
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911442121038&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_2nwj9de76o_e");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		Thread.sleep(10000);
	}

}
