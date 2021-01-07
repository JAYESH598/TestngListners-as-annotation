package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersXTest {
	
	 @Test
	 
	  public void setUp() {
		 
		 Assert.assertTrue(true);
		 
	 }
	 
	 

	 
@Test
	 
	 public void  test1() {
		 
		 
		 Assert.assertEquals("Success", "Success");
	 }

	 
	  @Test(dependsOnMethods = {"setUp"})
	  
	   public void test2() {
		  
		  Assert.assertTrue(true);
	  }
}
