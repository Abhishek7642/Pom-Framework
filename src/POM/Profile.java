package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	@FindBy(xpath="//p[@class='myAcc_tabsText bold']")
	private WebElement profile;
	@FindBy(xpath="//a[@class='myaccbtn myprofile']")
	private WebElement edit;
	public Profile( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void profile()
	{
		profile.click();
	}
	public void edit()
	{
		edit.click();
	}
	
	
	

}
