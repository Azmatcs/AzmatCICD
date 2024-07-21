package Testng.Practice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 {
	
	@Test
	public void Executefirstchk()
	{
		System.out.println("Checking Before Test Annotations");
	}
@BeforeTest
public void Executefirst()
{
	System.out.println("I wil Execute First");}
@BeforeSuite

public void BfireSuite() {
	System.out.println("Before Suite While i put in last Class");
}
}
