package com.abc.testngprog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("inside before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("inside afer method");
	}
	
	@Test
	public void testcase1() {
		System.out.println("testcase 1 executed");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testcase 2 executed");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("inside the after class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("inside the before class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("inside before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("inside after test");
	}
	

}
