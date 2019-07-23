package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Demo2 {
  @Test
  public void f() {
	  WebDriver driver = Driver_Utility1.getDriver("chrome");
	  String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("The title of the page: "+driver.getTitle());
	  Assert.assertEquals("Home", driver.getTitle());
	  Assert.assertTrue("Home".contains("Home"));
	  Assert.assertTrue("Home".startsWith("Ho"));
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.findElement(By.linkText("SignOut")).click();
	  driver.close();
  }
}
