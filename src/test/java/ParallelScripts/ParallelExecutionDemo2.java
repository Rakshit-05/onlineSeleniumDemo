package ParallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionDemo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
	@Test
	public void tc_03() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void tc_04() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}
