package Testng.Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class Day1{

	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite Testing while I am first in class");
	}
	@AfterTest

	public void ExecuteLast()
	{
		System.out.println("I will Execute Last");
	}
	@Test
	public void HomeLoanLogin()
	{
		System.out.println("Home Login page");
	}
	@Test(groups= {"Smoke"})
	public void HomeloanPayment()
	{
		System.out.println("Home Loan Payment");
		
	}
	@Test
	public void HomeLoanStatus()
	{
		System.out.println("Home Loan Status");
	}
	
	
}
