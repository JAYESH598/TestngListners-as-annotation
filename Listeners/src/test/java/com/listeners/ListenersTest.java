package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.listeners.Listeners.class)

public class ListenersTest {
	
	
	 @Test
	 
	  public void  setUp() {
		 
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
