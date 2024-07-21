package Testng.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day6 {
	@Test
	public void Day()
	{
		System.out.println("***********Day6 class starting************");
	}
	@Test
	public void chk()
	{System.out.println("A class kept beofre method");}
	
	@BeforeMethod
	public void beforeMethod()
	{System.out.println("*****Before Test Method checking******");}
@Test
public void chking()
{
	System.out.println("A class kept after Before Metohd");}
@AfterMethod

public void after()
{
	System.out.println("____AfterMethod Checking_____");
}

}
