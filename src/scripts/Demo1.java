package scripts;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




import generic.Auto_constant1;
import generic.Excel1;
import generic.Sample1;

public class Demo1 implements Auto_constant1 {
	static
	{
		System.setProperty(key,value);
	}
public static void main(String[] args) {
	String us=Excel1.abc(excelpath,"Sheet1",0,0);
	String pwd=Excel1.abc(excelpath,"Sheet1",1,0);
	//String name=Excel1.abc(excelpath,"Sheet1",2,0);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.koovs.com");
	Sample1 s1=new Sample1(driver);
	s1.login();
	s1.email(us);
	s1.pass(pwd);
	s1.log();
	
	
	
	
	
	
	
	
	
}
}

