package com.testyantra.retrydemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseForRerun {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
	@Test
	public void tc_01() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		assert.assertEquals(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
	}

	@Test
	public void tc_02() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
}
}

}
