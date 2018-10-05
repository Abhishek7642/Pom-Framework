package scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {
	@BeforeMethod
	public void openapp()
	{
		Reporter.log("Ab",true);
	}
	@AfterMethod
	public void closeapp()
	{
		Reporter.log("Cd",true);
	}
	@Test
	public void abc()
	{
		Reporter.log("EF",true);
	}
	
	

}
