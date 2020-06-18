package com.testyantrascripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UrbanLadderHomepage {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	

	@Test
	public void tc_01( ) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("Launching the Browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.urbanladder.com/");
Reporter.log("Loading the AUT");

driver.findElement(By.xpath("//div[@id='authentication_popup']/div/div/div[@class='popup-text text-center vert large-6 columns']/a[contains(.,'Close')]")).click();
Reporter.log("Closing the Welcome-Pop Up Window");
String e1 = "Furniture Online: Buy Home Wooden Furniture Online In India At Best Price - Urban Ladder - Urban Ladder";
String a1 = driver.getTitle();

Assert.assertEquals(e1, a1);
Reporter.log("Verifying the Title of the page");
List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li/span"));
	
List<String> menuItemsExpected = Arrays.asList("Sale","Living","Bedroom","Dining","Storage","Study","Mattresses","Decor","New","Collections");
List<String> menuItemsActual = new ArrayList<String>();
	
for(WebElement menuItem:menuItems) {
	menuItemsActual.add(menuItem.getText());
	System.out.println(menuItem.getText());
}

Assert.assertEquals(menuItemsActual, menuItemsExpected);
Reporter.log("Verifying the Menu Items");
Thread.sleep(3000);
driver.close();
Reporter.log("Closing the Browser");
	}
}
