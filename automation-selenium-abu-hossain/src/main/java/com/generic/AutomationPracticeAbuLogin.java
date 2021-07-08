package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class AutomationPracticeAbuLogin {
public static void baseLogin() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(BaseConfig.getConfigValue("URL"));
	
	
	
	driver.manage().window().maximize();
	ScreenShot.getScreenShot(driver, "Home Page");
	
	
	MasterPageFactory obj=new MasterPageFactory(driver);
	
	
	HighLighter.addColor(driver, obj.getSigninbtn());
	obj.getSigninbtn().click();
	
//	WebElement signinbtn=driver.findElement(By.xpath("//*[@class='login']"));
//	signinbtn.click();
//	
	
	HighLighter.addColor(driver, obj.getEmail());
	obj.getEmail().sendKeys(BaseConfig.getConfigValue("email"));
	
	
//	WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
//	email.sendKeys("sarowerny@gmail.com");
//	
	HighLighter.addColor(driver, obj.getPassword());
	obj.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
	
	
//	WebElement password=driver.findElement(By.xpath("//*[@id='passwd']"));
//	password.sendKeys("student");
	
	HighLighter.addColor(driver, obj.getFinalSinginbtn());
	ScreenShot.getScreenShot(driver, "Before final click");
	obj.getFinalSinginbtn().click();
	ScreenShot.getScreenShot(driver, "After final click");
	
//	WebElement finalSinginbtn =driver.findElement(By.xpath("//*[@name='SubmitLogin']"));
//	finalSinginbtn.click();
}
}
