package demo1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver_Utility1 {
	public static WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser and Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser and Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser and Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
		{
			return null;
		}
	}

}
