package qaClickAcademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\Harish Reddy\\eclipse-workspace\\MavenProject\\src\\main\\java\\qaClickAcademy\\data.properties");
		
		prop.load(FIS);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Reddy\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
