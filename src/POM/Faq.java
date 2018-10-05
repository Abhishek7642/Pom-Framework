package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faq {
	@FindBy(xpath="//a[@class='faq_contact_page']")
	private WebElement faq;
	public Faq( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void fact()
	{
		faq.click();
	}
	
	

}
