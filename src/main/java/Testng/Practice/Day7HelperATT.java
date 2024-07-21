package Testng.Practice;



import org.testng.annotations.Test;

public class Day7HelperATT {
@Test(dependsOnMethods= {"Helper","B"})
public void AHelperAt()
{
	System.out.println("Helper attribute");}


@Test

public void Helper()
{
	System.out.println("Depend Upon checking");}

@Test
public void B ()
{System.out.println("Lets Check Helper Attribute");}

@Test(enabled=false)
public void Enablechk()
{
	System.out.println("Chk Enable not working");}
}
