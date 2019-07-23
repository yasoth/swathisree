package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//upto testMethod9() Hard assertions
public class workouts6_assertions {
  @Test
  public void testMethod1() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void testMethod2() {
	  Assert.assertTrue("Hello".equals("Hi"));
  }
  @Test
  public void testMethod3() {
	  Assert.assertFalse(20>18);
  }
  @Test
  public void testMethod4() {
	  Assert.assertFalse("Hello".equals("Hi"));
  }
  @Test
  public void testMethod5() {
	  Assert.assertEquals(200,200);
  }
  @Test
  public void testMethod6() {
	  Assert.assertTrue("swathisree".contains("tree"));
	  Assert.assertTrue("swathisree".startsWith("swa"));
  }
  @Test
  public void testMethod7() {
	  Object obj1 = new Object();
	  Assert.assertNull(obj1);
	  int a=5;
	  Assert.assertNull(a);
  }
  @Test
  public void testMethod8() {
	  Object obj1 = new Object();
	  Object obj2 = obj1;
	  Assert.assertSame(obj1,obj2);
  }
  @Test
  public void testMethod9() {
	  Assert.fail("Intentionally Failing the Test");
  }
  
  //Soft assertions
  @Test
  public void softMethod1() {
	  SoftAssert sa= new SoftAssert();
	  System.out.println("Checking 1st Validation");
	  sa.assertEquals(10,12);
	  System.out.println("Checking 2nd Validation");
	  sa.assertTrue("swathisree".startsWith("swa"));
	  sa.assertAll();
  }


}
