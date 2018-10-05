package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	
	public Homepage( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void search(String name)
	{
		search.sendKeys(name);
		
	}
	

	
}
