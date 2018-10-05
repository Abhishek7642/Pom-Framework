package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	@FindBy(xpath="//img[@alt='Download the koovs.com APP']")
	private WebElement down;
	@FindBy(xpath="//img[@title='Available App On Google Play']")
	private WebElement opt;
	public Download( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void download()
	{
		down.click();
	}
	public void choose()
	{
		opt.click();
	}
	
	

}
