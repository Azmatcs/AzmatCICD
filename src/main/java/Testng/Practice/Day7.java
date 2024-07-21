package Testng.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day7 {
	
	@AfterClass
	public void AfterMethTest()
	{
		System.out.println("#######Afer Mehtod which kept in First place####");
	}
	
	@Test
	public void Beforeclasschk()
	{
		System.out.println("***Welcome to Day7****");
		
	}

	@Test
	public void Beforecls()
	{
		
		System.out.println("A Method  Before the BeforeClass Class");
	}
	@BeforeClass
	public void BeforeC() {
		
		System.out.println("___****Before Class Mehod****___");
	}
	
	@Test(groups= {"Smoke"})
	public void GroupTesting() {
		System.out.println("RegressionSuite3");
		
	}
}
