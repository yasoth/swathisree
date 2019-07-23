package demo1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_Demo1 {
WebDriver driver = null;
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browser and Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  String url = "http://www.google.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("The title of the page"+driver.getTitle());
	  
  }
}
