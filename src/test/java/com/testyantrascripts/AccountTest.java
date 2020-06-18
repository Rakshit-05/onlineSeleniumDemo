package com.testyantrascripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AccountTest {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
@Test
public void tc_01( ) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("httpa://www.ubuy.co.in/");
driver.findElement(By.xpath("//div[@class=\"newletter-pop-up-v2 up-v2"));
	WebDriver driver1 =  new ChromeDriver();
	
}

}
