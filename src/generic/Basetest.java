package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Auto_constant1{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get("https://www.koovs.com");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
