package qaClickAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Sample {

	@Test
	public void Test123()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.close();
	}
	
	@Test
	public void Test1234()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.close();		
		
	}
	
}
