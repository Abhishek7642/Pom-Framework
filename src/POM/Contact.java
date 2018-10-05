package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	@FindBy(xpath="//img[@alt='Contact US']")
	private WebElement contact;
	public Contact( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void cont()
	{
		contact.click();
	}
	

}
