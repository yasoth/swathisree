package demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.annotations.DataProvider;

public class workouts5_testng {
  @Test(dataProvider = "getData")
  public void testlogin(String username, String password) {
	  System.out.println("you have provided username as: "+username);
	  System.out.println("you have provided password as: "+password);
  }

  @DataProvider
  public Object[][] getData() {
    Object[][]data=
    {
    		{"swathi","sree"},
    		{"Ajith","kumar"},
    		{"sasi","kala"}
    };
    return data;
  };
}
