package com.abc.testngprog;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsinTestNG {
	@Test
	public void Testcase1() {
		Assert.fail();
		System.out.println("Tstcase 1 got executed");
	}
	@Test(dependsOnMethods="Testcase1")
	public void Testcase2() {
		System.out.println("Tstcase 2 got executed");
	}
	@Test(dependsOnMethods="Testcase1", alwaysRun=true)
	public void Testcase3() {
		System.out.println("Tstcase 3 got executed");
	}
	@Test(enabled=false)
	public void Testcase4() {
		System.out.println("Tstcase 4 got executed");
	}
	@Test(invocationCount=3)
	public void Testcase5() {
		System.out.println("Tstcase 5 got executed");
	}
	@Test
	public void Testcase6() {
		System.out.println("Tstcase 6 got executed");
	}
}
