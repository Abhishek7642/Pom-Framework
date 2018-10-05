package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	@FindBy(xpath="//a[.='WOMEN']")
	private WebElement link;
	@FindBy(xpath="//area[@shape='rect']")
	private WebElement shopping;
	public Women( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void women()
	{
		link.click();
	}
	public void shop()
	{
		shopping.click();
	}

}
