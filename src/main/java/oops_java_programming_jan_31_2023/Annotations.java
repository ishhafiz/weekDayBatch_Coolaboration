package oops_java_programming_jan_31_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("This is before method annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test annotation ");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before Class annotation ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before test method annotation");
	}
	
	@Test
	public void TestCase() {
		System.out.println("This is my test case annotation");
	}
	
	@Test
	public void TestCase1() {
		System.out.println("This is my test case annotation");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after test method annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after Class annotation ");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test annotation ");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("This is after method annotation");
	}
	
	
	
	
}
