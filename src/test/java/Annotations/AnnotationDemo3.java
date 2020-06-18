package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AnnotationDemo3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executed");
	}
}
