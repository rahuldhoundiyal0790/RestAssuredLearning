package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Inside Before Suite ..........");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Inside Before Class ..........");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Inside Before Test ...........");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Inside Before Method .........");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Inside After Suite ..........");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Inside After Class ..........");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("Inside After Test ...........");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("Inside After Method .........");
	}


}
