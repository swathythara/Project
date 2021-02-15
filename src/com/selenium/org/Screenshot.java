package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\eclipse-workspace\\Eclipse_Seleniumwebdriver_Connectivity\\Driver_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911442121038&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_2nwj9de76o_e");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;

		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\vidya\\eclipse-workspace\\Eclipse_Seleniumwebdriver_Connectivity\\Screenshot\\Amazon.png");
		FileUtils.copyFile(sourcefile, destfile);
		
		
		
	}

}
