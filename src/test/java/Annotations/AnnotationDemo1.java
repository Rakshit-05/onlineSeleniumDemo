package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 extends AnnotationDemo3 {
	@BeforeClass
	public void beforeClassOne() {
		System.out.println("Before Class Executed in Demo1");
	}

	@AfterClass
	public void afterClassOne() {
		System.out.println("After Class Executed in Demo2");
	}

	@Test
	public void tc_01() {
		System.out.println("Executed tc_01");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Before Method Executed");
	}
	
	
}