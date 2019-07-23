package demo1;

import org.testng.annotations.Test;

public class workouts4_testng {
  @Test(priority=2)
  public void a() {
	  System.out.println("Login method");
  }
  @Test(priority=3,enabled=false)
  public void B() {
	  System.out.println("Register method");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("Logout method");
  }
  @Test
  public void A() {
	  System.out.println("Home Page");
  }
}
