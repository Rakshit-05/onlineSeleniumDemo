package com.testyantrascripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTime4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
@Test
public void tc_01( ) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
SoftAssert s = new SoftAssert();
	driver.get("https://demo.actitime.com/login.do");
String e1="actiTIME - Login";
String a1 = driver.getTitle();
s.assertEquals(a1, e1);//<----(1)
Thread.sleep(4000);
Actions act = new Actions(driver);
WebElement Forgot_your_password=driver.findElement(By.xpath("//td[@id='loginRecoveryLinkContainer']"));
Forgot_your_password.click();
Thread.sleep(3000);
driver.close();



}
}
