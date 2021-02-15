package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_SendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vidya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		// WebElement from_location = driver.findElement(By.xpath("//input[@id=
		// 'src']"));
		// from_location.sendKeys("chennai");
		// WebElement to_location = driver.findElement(By.xpath("//input[@id =
		// 'dest']"));
		// to_location.sendKeys("Hosur");

		/*
		 * Thread.sleep(7000); WebElement login_username =
		 * driver.findElement(By.xpath("//input[@class='login_input']"));
		 * login_username.sendKeys("9566658782");
		 * 
		 * Thread.sleep(5000); WebElement login_Password =
		 * driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
		 * login_Password.sendKeys("lkjhk");
		 */

		/*
		 * Thread.sleep(5000); WebElement search_text =
		 * driver.findElement(By.xpath("//a[@href='contact.php']"));
		 * search_text.click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement Name =
		 * driver.findElement(By.xpath("//input[@class='form-control']"));
		 * Name.sendKeys("Sujani");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement Email = driver.findElement(By.xpath("\r\n" +
		 * "(//input[@class='form-control'])[2]"));
		 * Email.sendKeys("Sujaniraga@gmail.com");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement MobileNumber =
		 * driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		 * MobileNumber.sendKeys("9962038564" + "");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement Course =
		 * driver.findElement(By.xpath("//select[@name='courses']"));
		 * Course.sendKeys("Selenium");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement branch =
		 * driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		 * branch.sendKeys("Adayar");
		 */

		/*
		 * Thread.sleep(3000);
		 * 
		 * WebElement Planning = driver.findElement(By.xpath("//select[@name='time']"));
		 * Planning.sendKeys("Immediately");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement Message = driver.findElement(By.
		 * xpath("(//textarea[@class='form-control input-message'])"));
		 * Message.sendKeys("Interested to join");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * WebElement Submit =
		 * driver.findElement(By.xpath("//span[text()='Submit Now']")); Submit.click();
		 * 
		 */
		/*
		 * Thread.sleep(3000);
		 * 
		 * WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		 * Email.sendKeys("swathy.thara@gmail.com");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		 * Password.sendKeys("s@fgr#gh");
		 */
		/*
		 * Thread.sleep(5000); JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollby(0,5000)");
		 */
		/*
		 * Thread.sleep(3000); driver.manage().window().maximize();
		 * 
		 * Thread.sleep(3000); WebElement signin =
		 * driver.findElement(By.xpath("//i[@id='i-icon-profile']")); signin.click();
		 * 
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement signin1 = driver.findElement(By.xpath("//li[@id='signInLink']"));
		 * signin1.click();
		 * 
		 * Thread.sleep(3000); driver.navigate().to("http://www.redbus.in/");
		 * 
		 * Thread.sleep(3000); WebElement signin21 =
		 * driver.findElement(By.xpath("//i[@id='i-icon-profile']")); signin21.click();
		 * 
		 * Thread.sleep(3000); WebElement signin11 =
		 * driver.findElement(By.xpath("//li[@id='signInLink']")); signin11.click();
		 * 
		 * Thread.sleep(20000); WebElement countrycode =
		 * driver.findElement(By.xpath("\r\n" + "\r\n" + "\r\n" +
		 * "//ul[@class='select_input_code']")); countrycode.sendKeys("91");
		 * 
		 * Thread.sleep(20000); WebElement mobilenumber =
		 * driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		 * mobilenumber.sendKeys("9566658782");
		 * 
		 * Thread.sleep(20000); WebElement Googlesignin =
		 * driver.findElement(By.xpath("//input[@id= 'src']")); Googlesignin.click();
		 */

		/*
		 * Thread.sleep(5000); WebElement From = driver.findElement(By.
		 * xpath("//input[contains(@class,'autocomplete required')]"));
		 * From.sendKeys("chennai"); Thread.sleep(5000);
		 * 
		 * WebElement To = driver.findElement(By.
		 * xpath("(//input[contains(@class,'autocomplete required')])[2]"));
		 * To.sendKeys("Bangalore");
		 */

		/*
		 * WebElement corejava_button =
		 * driver.findElement(By.xpath("//span[text()='Core Java']"));
		 * corejava_button.click();
		 */
		/*
		 * Thread.sleep(3000); driver.manage().window().maximize();
		 * 
		 * Thread.sleep(3000); WebElement Signin_AccLists =
		 * driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		 * Signin_AccLists.click();
		 * 
		 * Thread.sleep(3000); WebElement createAmazonacc =
		 * driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		 * createAmazonacc.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement Name =
		 * driver.findElement(By.xpath("//input[@name='customerName']"));
		 * Name.sendKeys("Swathy");
		 * 
		 * Thread.sleep(20000); WebElement mobilenumber =
		 * driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		 * mobilenumber.sendKeys("9566658782");
		 * 
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		 * email.sendKeys("swathy.thara@gmail.com");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//input[@id='ap_password']"));
		 * password.sendKeys("1@2&ttul");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * WebElement Continue =
		 * driver.findElement(By.xpath("//span[@id='auth-continue-announce']"));
		 * Continue.click();
		 * 
		 * Thread.sleep(3000);
		 */
		/*
		 * WebElement FirstName =
		 * driver.findElement(By.xpath("//input[@id='firstName']"));
		 * FirstName.sendKeys("Swathy");
		 * 
		 * WebElement LastName =
		 * driver.findElement(By.xpath("//input[@id='lastName']"));
		 * LastName.sendKeys("Thara");
		 * 
		 * WebElement emailID = driver.findElement(By.xpath("//input[@id='username']"));
		 * emailID.sendKeys("Swathy.thara");
		 * 
		 * WebElement Password =
		 * driver.findElement(By.xpath("(//input[contains(@class,'whsOn')])[4]"));
		 * Password.sendKeys("Thara123");
		 * 
		 * WebElement ConfirmPassword =
		 * driver.findElement(By.xpath("(//input[contains(@class,'whsOn')])[4]"));
		 * ConfirmPassword.sendKeys("Thara123");
		 * 
		 * WebElement SigninInstead =
		 * driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb'][3]"));
		 * SigninInstead.click();
		 */
		
		Thread.sleep(3000);
		
		WebElement Signin = driver.findElement(By.xpath("//span[@class='accountUserImg col-xs-9']"));
		Signin.click();
		
		Thread.sleep(3000);
		
		WebElement Register = driver.findElement(By.xpath("//span[text()='Register']"));
	    Register.click();
	    
	    Thread.sleep(3000);
	    
	    WebElement Mobileoremail_countrycode = driver.findElement(By.xpath("//input[@id='username']"));
	    Mobileoremail_countrycode.sendKeys("Swathythara");
	    
		/*
		 * WebElement Mobileoremail = driver.findElement(By.
		 * xpath("//label[text()='Please enter your mobile number or email']"));
		 * Mobileoremail.sendKeys("9566658782");
		 */
	    
	    Thread.sleep(3000);
	    
	    WebElement Continue = driver.findElement(By.xpath("//button[text()='continue']"));
	    Continue.click();
	    
		
		Thread.sleep(5000);
		driver.quit();

	}

}
